### 6.3. Algoritmos de Monte Carlo

Los **algoritmos de Monte Carlo** son técnicas probabilistas que utilizan simulaciones aleatorias para aproximar soluciones a problemas matemáticos y de decisión complejos. A continuación se desarrollan sus principios, pasos típicos y ejemplos de aplicación.

#### 1. Principio básico
1. **Muestreo aleatorio**  
   Se generan muestras aleatorias de variables de entrada según una distribución conocida.
2. **Evaluación**  
   Cada muestra se evalúa mediante la función o modelo objetivo.
3. **Agregación**  
   Se promedian los resultados de todas las simulaciones para aproximar el valor deseado.

#### 2. Pasos genéricos del método

1. **Definir el dominio**  
   Identificar el espacio de parámetros \(X\subseteq \mathbb{R}^n\) y la función objetivo \(f(x)\).
2. **Generar \(N\) muestras**  
   \[
     x_1, x_2, \dots, x_N \sim P_X
   \]
   donde \(P_X\) es la distribución de probabilidad sobre \(X\).
3. **Calcular estimaciones**  
   \[
     y_i = f(x_i), \quad i = 1, \dots, N
   \]
4. **Aproximación final**  
   \[
     \hat{I} = \frac{1}{N} \sum_{i=1}^{N} y_i
   \]
   Con \(N\to\infty\), \(\hat{I}\) converge a la esperanza matemática \(\mathbb{E}[f(X)]\).

#### 3. Pseudocódigo

function MonteCarlo(f, P, N):
    sum ← 0
    for i in 1..N do
        x ← sample(P)       # generar muestra aleatoria
        sum ← sum + f(x)    # evaluar y acumular
    end for
    return sum / N         # promedio de las evaluaciones


##### 4. Ejemplos de aplicación

- **Valor en riesgo (VaR) en finanzas**  
  Simulación de escenarios de mercado para estimar probabilidades de pérdidas extremas.

- **Simulación de colas y redes**  
  Modelado de sistemas de espera (colas) en telecomunicaciones o manufactura.

- **Optimización estocástica**  
  Métodos como *Simulated Annealing* que usan Monte Carlo para escapar de óptimos locales.

---

#### 5. Ventajas y limitaciones

#### Ventajas

- Fácil de implementar y altamente paralelo.  
- No requiere derivadas ni estructuras analíticas complejas.

#### Limitaciones

- Convergencia lenta: el error típico es \(O(1/N)\).  
- Requiere muchas muestras para alta precisión.
