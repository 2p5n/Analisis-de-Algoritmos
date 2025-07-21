# Semana 6: Algoritmos probabilistas

## 6.1. Tiempo esperado
- **Definición**: Es el tiempo medio de ejecución de un algoritmo aleatorizado sobre una entrada fija, promediando sobre todas sus posibles elecciones internas (semillas o variables aleatorias).  
- **Notación**: Si \(T(I, R)\) es el tiempo de un algoritmo sobre la entrada \(I\) con elecciones aleatorias \(R\), el tiempo esperado es  
  \[
    E[T(I, R)] = \sum_{r} T(I, r) \cdot \Pr[R = r].
  \]
- **Tipos de algoritmos**:
  - **Las Vegas**: Siempre devuelven la solución correcta, pero el tiempo de ejecución es aleatorio. Ejemplo: *Randomized QuickSort* con pivote aleatorio.  
  - **Monte Carlo**: Tienen tiempo de ejecución determinista (o acotado), pero la solución es correcta con alta probabilidad. Ejemplo: prueba de primalidad de Miller–Rabin.

## 6.2. Algoritmos numéricos probabilistas
Emplean técnicas aleatorias para aproximar soluciones de problemas numéricos complejos, con garantías probabilísticas de error y convergencia.

### 6.2.1. Generación de números pseudoaleatorios (PRNG)
- **Generador Congruencial Lineal (LCG)**:  
  \[
    X_{n+1} = (a\,X_n + c)\bmod m,
  \]  
  donde \(X_0\) es la semilla, y \(a\), \(c\), \(m\) son constantes que definen el período y la calidad.  
- **Propiedades deseables**:
  - **Period**: Largo periodo antes de repetirse.
  - **Uniformidad**: Distribución cercana a uniforme.
  - **Independencia**: Poca correlación entre valores sucesivos.

### 6.2.2. Método de Monte Carlo para integración
- **Objetivo**: Aproximar la integral  
  \[
    I = \int_{a}^{b} f(x)\,\mathrm{d}x
  \]
  usando muestras aleatorias \(x_i \sim U(a, b)\).
- **Algoritmo básico**:
  1. Fijar \(N\), el número de muestras.
  2. Generar \(x_1, x_2, \dots, x_N\) uniformes en \([a, b]\).
  3. Calcular  
     \[
       \hat{I} = \frac{b - a}{N} \sum_{i=1}^{N} f(x_i).
     \]
- **Error y convergencia**:  
  - Varianza de \(\hat{I}\): \(\displaystyle \sigma^2/N\), donde \(\sigma^2\) es la varianza de \(f(x)\) en \([a,b]\).  
  - Convergencia en probabilidad: \(\hat{I} \xrightarrow{p} I\) cuando \(N \to \infty\).

#### Pseudocódigo

function MonteCarloIntegracion(f, a, b, N):
    sum ← 0
    for i from 1 to N do:
        x ← aleatorio_uniforme(a, b)
        sum ← sum + f(x)
    return (b - a) * sum / N

#### 6.2.3. Resolución de sistemas lineales

- **Contexto**: Para resolver \(A \mathbf{x} = \mathbf{b}\) en sistemas grandes y dispersos, donde los métodos deterministas directos (p.ej. factorización LU) son muy costosos, se puede usar un método probabilista para aproximar la inversa de \(A\).  
- **Algoritmo**:
  1. Generar \(M\) vectores aleatorios \(\mathbf{u}^{(1)}, \dots, \mathbf{u}^{(M)}\), donde cada componente es independiente y toma valor \(\pm1\) con probabilidad \(1/2\).  
  2. Para cada \(\mathbf{u}^{(i)}\), resolver \(A \mathbf{y}^{(i)} = \mathbf{u}^{(i)}\) (usando un método directo o iterativo eficiente para matrices dispersas).  
  3. Estimar la entrada \((j,k)\) de \(A^{-1}\) como  
     \[
       \widehat{(A^{-1})}_{jk} = \frac{1}{M} \sum_{i=1}^{M} y^{(i)}_j \, u^{(i)}_k.
     \]
- **Aplicaciones**:  
  - Sistemas lineales dispersos de gran dimensión (p.ej. en análisis de redes, simulaciones físicas).  
  - Estimación de soluciones parciales de \(\mathbf{x} = A^{-1}\mathbf{b}\) sin construir \(A^{-1}\) completo.

---

#### 6.2.4. Otras aplicaciones Monte Carlo

- **Estimación de volúmenes** de regiones multidimensionales complejas  
- **Simulación de variables aleatorias** en finanzas, física, biología, etc.  
- **Optimización estocástica**  
  - Algoritmos como *Simulated Annealing* o *Genetic Algorithms* que usan muestreos aleatorios para escapar de óptimos locales.

---

## Ventajas

- **Simplicidad** de implementación.  
- **Escalabilidad** a alta dimensión (el coste crece linealmente con el número de muestras).  

## Desventajas

- **Convergencia lenta**: el error típico decrece como \(O(1/\sqrt{N})\), donde \(N\) es el número de muestras.  
- **Alta necesidad de muestras** para lograr precisión alta, lo que puede implicar un gran coste computacional.
