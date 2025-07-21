# Algoritmia Elemental

## Semana 8: Resumen detallado de las Semanas 1 a 7

En esta semana repasamos los conceptos clave de cada bloque temático, consolidando la teoría y presentando conexiones entre las técnicas.

---

### 1. Algoritmos voraces (Semanas 1–2)

#### Características generales  
- Heurística de “óptimo local” en cada paso.  
- Bajo coste computacional y fácil implementación.  
- Riesgo de no hallar la solución global óptima.

#### Grafos no dirigidos  
- **Árbol de recubrimiento mínimo (MST)**  
  - **Kruskal**: ordena aristas, añade si no crea ciclos (estructura Union‑Find).  
  - **Prim**: expande desde un vértice, añade la arista mínima que conecte nuevos nodos.  

#### Grafos dirigidos  
- Lista de adyacencia vs. matriz de adyacencia.  
- Aplicaciones a dependencias y flujos unidireccionales.  
- Ejercicio recomendado: implementar el algoritmo de Edmonds para arborescencias mínimas.

---

### 2. Divide y vencerás (Semanas 3–5)

#### Búsqueda binaria  
- Divide el espacio de búsqueda a la mitad.  
- Complejidad Θ(log n).  
- Variante: encontrar primera/última ocurrencia en presencia de duplicados.  

#### Ordenación  
- **Merge Sort**  
  - Divide recursivamente y fusiona.  
  - Estable, Θ(n log n), requiere espacio adicional Θ(n).  
- **Quicksort**  
  - Partición en torno a un pivote.  
  - En‑place, Θ(n log n) promedio, Θ(n²) peor caso.  
  - Optimizar selección de pivote (aleatorio o mediano de tres).

#### Selección de la mediana  
- **Quickselect**  
  - Partición única hacia la mediana sin ordenar todo el arreglo.  
  - Tiempo esperado Θ(n), peor caso Θ(n²).  

#### Multiplicación de matrices  
- Producto estándar Θ(n³).  
- **Strassen**: reduce a Θ(n^{2.81}) usando 7 productos de submatrices.

---

### 3. Algoritmos probabilistas (Semanas 6–7)

#### Tiempo esperado  
- Definición: \(E[T] = \sum p_i\,T_i\).  
- Estimación por simulación Monte Carlo.  

#### Algoritmos numéricos probabilistas  
- Generador congruencial lineal (LCG) para PRNG.  
- Monte Carlo para integración:  
  \[
    I \approx \frac{b - a}{N}\sum_{i=1}^{N} f\bigl(a + u_i(b - a)\bigr).
  \]

#### Monte Carlo general  
- Simulación aleatoria en un dominio de \(\mathbb{R}^d\).  
- Error estándar \(O(1/\sqrt{N})\).  
- Variantes: muestreo estratificado, importancia, control variates.  

#### Ejemplos y ejercicios  
- Estimación de \(\pi\) con “dardos”.  
- Integrales de alta dimensión (p. ej. \(\int_{[0,1]^3} xyz\,dx\,dy\,dz\)).  
- Técnicas de reducción de varianza.

---

### Conexiones y perspectivas

1. **Desde lo determinista…**  
   - Voraces y divide y vencerás ofrecen soluciones exactas o con garantías de rendimiento.

2. **…hacia la aleatoriedad**  
   - Algoritmos probabilistas extienden la caja de herramientas permitiendo aproximaciones eficientes cuando lo exacto es costoso o imposible.

3. **Práctica y aplicación**  
   - Cada familia de algoritmos incluye implementaciones, análisis de complejidad y ejercicios de laboratorio que refuerzan la comprensión.

---

Este resumen no solo recapitula los temas, sino que destaca las técnicas comunes (dividir, elegir local, simular) y su evolución: de métodos puramente deterministas hasta enfoques que incorporan aleatoriedad para ganar eficiencia y manejabilidad en problemas complejos.  
