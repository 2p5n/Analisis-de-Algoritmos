# Algoritmia Elemental

## Semana 8: Resumen detallado de las Semanas 1 a 7

### 1. Algoritmos voraces (Semanas 1–2)

#### Características generales  
- Utilizan la heurística de “óptimo local” en cada paso.  
- Bajo coste computacional y fácil implementación.  
- Riesgo de no encontrar la solución global óptima.

#### Grafos no dirigidos  
- **Árbol de recubrimiento mínimo (MST)**  
  - **Kruskal**: ordena aristas y añade las que no generan ciclos, usando estructura Union‑Find.  
  - **Prim**: parte desde un vértice e incorpora la arista mínima que conecta nuevos nodos.  

#### Grafos dirigidos  
- Comparación entre lista de adyacencia y matriz de adyacencia.  
- Aplicaciones en problemas de dependencias y flujos unidireccionales.  
- Ejercicio recomendado: implementar el algoritmo de Edmonds para arborescencias mínimas.

---

### 2. Divide y vencerás (Semanas 3–5)

#### Búsqueda binaria  
- Divide el espacio de búsqueda a la mitad en cada paso.  
- Complejidad en tiempo logarítmico.  
- Variante: localizar la primera o última aparición en presencia de duplicados.

#### Ordenación  
- **Merge Sort**  
  - Divide recursivamente y fusiona.  
  - Algoritmo estable, con eficiencia en tiempo proporcional a n log n y requiere memoria adicional lineal.  
- **Quicksort**  
  - Hace particiones alrededor de un pivote.  
  - Muy eficiente en promedio, aunque puede degradarse en casos adversos.  
  - Mejora la selección de pivote usando opciones aleatorias o la mediana de tres.

#### Selección de la mediana  
- **Quickselect**  
  - Encuentra la mediana sin ordenar todo el arreglo.  
  - Tiempo promedio lineal, pero puede ser cuadrático en el peor caso.

#### Multiplicación de matrices  
- Algoritmo estándar con coste cúbico.  
- **Strassen**: reduce ese coste usando menos productos de submatrices.

---

### 3. Algoritmos probabilistas (Semanas 6–7)

#### Tiempo esperado  
- Promedio ponderado de los tiempos de ejecución según las posibles elecciones internas.  
- Se puede estimar con simulaciones de Monte Carlo.

#### Algoritmos numéricos probabilistas  
- Uso de generadores congruenciales lineales para producir números pseudoaleatorios.  
- Método de Monte Carlo para aproximar integrales mediante muestras aleatorias.  
- Variantes de muestreo: estratificado, de importancia y control de variables.

#### Monte Carlo general  
- Simulación aleatoria en dominios de varias dimensiones.  
- El error disminuye al aumentar las muestras, de forma inversamente proporcional a la raíz cuadrada del número total.  
- Técnicas para reducir la varianza y mejorar la precisión.

#### Ejemplos y ejercicios  
- Estimación de constantes numéricas mediante técnicas de “dardos”.  
- Cálculo aproximado de integrales en espacios multidimensionales.  
- Aplicación de métodos de reducción de varianza.

---

### Conexiones y perspectivas

1. **Desde lo determinista…**  
   - Los algoritmos voraces y de divide y vencerás ofrecen soluciones exactas o con garantías de rendimiento.

2. **…hacia la aleatoriedad**  
   - Los algoritmos probabilistas amplían las herramientas al permitir aproximaciones eficientes cuando las soluciones exactas son demasiado costosas.

3. **Práctica y aplicación**  
   - Cada familia de algoritmos incluye implementaciones, análisis de complejidad y ejercicios que refuerzan la comprensión.
