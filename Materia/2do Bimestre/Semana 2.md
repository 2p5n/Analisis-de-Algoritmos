# Algoritmia Elemental

## Semana 2: 4. Algoritmos voraces

### 4.3. Grafos dirigidos

- **Definición**  
  Un **grafo dirigido** \(G\) se compone de:  
  1. Un conjunto de **vértices** \(V\) (también llamados nodos o puntos).  
  2. Un conjunto de **arcos** \(A\), donde un arco es un **par ordenado** \((v,w)\):  
     - \(v\) es la **cola** (origen).  
     - \(w\) es la **cabeza** (destino). :contentReference[oaicite:0]{index=0}  

- **Representaciones más comunes**  
  1. **Lista de adyacencia**  
     - Para cada vértice, se almacena la lista de sucesores (arcos salientes).  
     - Ventaja: ahorra espacio en grafos dispersos (\(O(V + E)\)).  
  2. **Matriz de adyacencia**  
    Sea \(M\) la matriz de adyacencia de dimensión \(V \times V\), definida como:
    \[
      M_{i,j} =
      \begin{cases}
        1, & \text{si existe el arco }(i, j),\\
        0, & \text{en caso contrario}.
      \end{cases}
    \]
     - Ventaja: acceso \(O(1)\) para consultar existencia de arco; desventaja: espacio \(O(V^2)\).  

- **Aplicaciones típicas**  
  - Modelado de **dependencias** (por ejemplo, en tareas con precedencias).  
  - **Flujos de datos** y rutas en redes de comunicación unidireccionales.  
  - **Estados y transiciones** en autómatas y grafos de decisión.  

- **Taller (Ejercicios prácticos)**  
  1. **Construir la representación**  
     - Dado un pequeño conjunto de arcos dirigidos, crear su lista de adyacencia y su matriz de adyacencia.  
  2. **Recubrimiento mínimo dirigido**  
     - Investigar (o implementar) el algoritmo de Edmonds para encontrar una **arborescencia de recubrimiento mínimo** en un grafo dirigido con raíces predeterminadas.  
  3. **Ruta más corta con heurística voraz**  
     - Partiendo de un vértice fuente, aplicar un algoritmo voraz (por ejemplo, **Dijkstra**) que en cada paso seleccione el vértice no procesado con la **distancia mínima** desde la fuente, y actualizar distancias a sus sucesores.  

