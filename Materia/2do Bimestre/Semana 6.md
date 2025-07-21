# Semana 6: Algoritmos probabilistas

## 6.1. Tiempo esperado
- **Definición**: Es el tiempo medio de ejecución de un algoritmo aleatorizado sobre una entrada fija, promediando sobre todas sus posibles elecciones internas (semillas o variables aleatorias).  
- **Notación simplificada**: Se calcula sumando cada posible tiempo de ejecución multiplicado por la probabilidad de esa elección interna.

- **Tipos de algoritmos**:
  - **Las Vegas**: Siempre devuelven la solución correcta, pero el tiempo de ejecución es aleatorio.  
    Ejemplo: Randomized QuickSort con pivote elegido al azar.  
  - **Monte Carlo**: Tienen tiempo de ejecución acotado, pero la solución es correcta con alta probabilidad.  
    Ejemplo: prueba de primalidad de Miller–Rabin.

## 6.2. Algoritmos numéricos probabilistas
Utilizan técnicas aleatorias para aproximar soluciones de problemas numéricos complejos, con garantías probabilísticas sobre el error y la convergencia.

### 6.2.1. Generación de números pseudoaleatorios (PRNG)
- **Generador Congruencial Lineal (LCG)**:  
  Produce una secuencia de números a partir de una semilla inicial y constantes definidas.  
- **Propiedades deseables**:  
  - Largo período antes de repetirse.  
  - Distribución cercana a uniforme.  
  - Poca correlación entre valores sucesivos.

### 6.2.2. Método de Monte Carlo para integración
- **Objetivo**: Aproximar el valor de una integral definida sobre un intervalo, usando muestras aleatorias uniformes.  
- **Algoritmo básico**:
  1. Elegir cuántas muestras tomar.  
  2. Generar cada muestra de forma uniforme en el intervalo deseado.  
  3. Calcular la media de las evaluaciones de la función y multiplicar por la longitud del intervalo.

- **Error y convergencia**:  
  - El error disminuye de forma inversamente proporcional a la raíz cuadrada del número de muestras.  
  - Al aumentar indefinidamente las muestras, la aproximación converge a la solución real con alta probabilidad.

#### Pseudocódigo

function MonteCarloIntegracion(f, a, b, N):
sum ← 0
for i from 1 to N do:
x ← aleatorio_uniforme(a, b)
sum ← sum + f(x)
return (b - a) * sum / N


### 6.2.3. Resolución de sistemas lineales
- **Contexto**: En sistemas grandes y dispersos, calcular directamente la inversa de la matriz puede ser muy costoso.  
- **Algoritmo probabilista**:
  1. Generar varios vectores aleatorios cuyos componentes son +1 o –1.  
  2. Para cada vector, resolver el sistema lineal que lo iguala a la matriz original (usando un método directo o iterativo).  
  3. Combinar esas soluciones para estimar las entradas de la matriz inversa.

- **Aplicaciones**:  
  - Análisis de redes y simulaciones físicas con matrices dispersas.  
  - Estimaciones parciales de la solución sin calcular toda la inversa.

---

### 6.2.4. Otras aplicaciones de Monte Carlo
- Estimación de volúmenes en espacios de alta dimensión.  
- Simulación de variables aleatorias en finanzas, física o biología.  
- Optimización estocástica, como Simulated Annealing o algoritmos genéticos para escapar de óptimos locales.

---

## Ventajas
- Implementación sencilla.  
- Escalable a alta dimensión, ya que el coste crece de forma lineal con el número de muestras.

## Desventajas
- Convergencia lenta: requiere muchas muestras para alta precisión.  
- Alto coste computacional cuando se buscan errores muy pequeños.
