### 6.3. Algoritmos de Monte Carlo

Los **algoritmos de Monte Carlo** son técnicas probabilistas que utilizan simulaciones aleatorias para aproximar soluciones a problemas matemáticos y de decisión complejos. A continuación se desarrollan sus principios, pasos típicos y ejemplos de aplicación.

#### 1. Principio básico
1. **Muestreo aleatorio**  
   Se generan muestras aleatorias de las variables de entrada según una distribución conocida.
2. **Evaluación**  
   Cada muestra se evalúa con la función o modelo objetivo.
3. **Agregación**  
   Se promedian todos los resultados de las simulaciones para obtener la aproximación final.

#### 2. Pasos genéricos del método

1. **Definir el dominio**  
   Identificar el espacio de parámetros y la función objetivo.
2. **Generar N muestras**  
   Tomar N puntos de muestra de la distribución de probabilidad sobre el dominio.
3. **Calcular estimaciones**  
   Evaluar la función objetivo en cada muestra y acumular los resultados.
4. **Obtener la aproximación final**  
   Dividir la suma de las evaluaciones entre el número de muestras. Al aumentar indefinidamente las muestras, la media converge al valor esperado de la función.

#### 3. Pseudocódigo

function MonteCarlo(f, P, N):
sum ← 0
for i in 1..N do
x ← sample(P) # generar muestra aleatoria
sum ← sum + f(x) # evaluar y acumular
end for
return sum / N # promedio de las evaluaciones

#### 4. Ejemplos de aplicación

- **Valor en riesgo (VaR) en finanzas**  
  Simulación de escenarios de mercado para estimar probabilidades de pérdidas extremas.

- **Simulación de colas y redes**  
  Modelado de sistemas de espera en telecomunicaciones o manufactura.

- **Optimización estocástica**  
  Métodos como Simulated Annealing, que usan Monte Carlo para escapar de óptimos locales.

---

#### 5. Ventajas y limitaciones

**Ventajas**

- Fácil de implementar y muy paralelo.  
- No requiere derivadas ni análisis complejo de la función.

**Limitaciones**

- Convergencia lenta: el error disminuye lentamente al aumentar las muestras.  
- Necesita muchas simulaciones para lograr alta precisión.
