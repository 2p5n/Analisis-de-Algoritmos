# Algoritmia Elemental

## Semana 1: 4. Algoritmos voraces

### 4.1. Características
- Son rápidos y fáciles de implementar, ideales para problemas de optimización sencillos.  
- Siguen una heurística de “óptimo local” en cada paso, con la esperanza de encontrar un óptimo global tras varias iteraciones.

- **Ejemplos típicos**:
  - Cambio de monedas: usar la menor cantidad de monedas posibles para dar un cambio.  
  - Selección de actividades: elegir el máximo número de tareas que no se solapen.  
  - Codificación de Huffman: asignar códigos binarios de longitud mínima según frecuencias.

- **Ventajas**:
  - Implementación sencilla.  
  - Bajo costo computacional en muchos casos.  
  - A veces encuentran la solución óptima.

- **Desventajas**:
  - No garantizan solución global óptima.  
  - Dificultad para diseñar la función de selección que asegure el mejor paso local.

### 4.2. Grafos no dirigidos
- **Árbol de recubrimiento mínimo (MST)**:  
  - Subgrafo árbol que conecta todos los vértices de un grafo no dirigido.  
  - Minimiza la suma de los pesos de las aristas seleccionadas.  
  - Aplicaciones: diseño de redes de distribución, comunicaciones y sistemas de energía.

- **Algoritmos clásicos**:
  1. **Kruskal**  
     - Ordena todas las aristas de menor a mayor peso.  
     - Añade cada arista siempre que no forme un ciclo (usando una estructura Union‑Find).  
     - Muy eficiente para grafos dispersos.  
  2. **Prim**  
     - Comienza desde un vértice inicial.  
     - En cada paso, incorpora la arista de menor peso que conecte el árbol actual con un vértice nuevo.  
     - Ideal cuando se implementa con montículos para acelerar la selección de la siguiente arista.
