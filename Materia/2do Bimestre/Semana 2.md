## Semana 2: 4. Algoritmos voraces

### 4.3. Grafos dirigidos

- **Definición**  
  Un grafo dirigido está formado por:  
  1. Un conjunto de vértices (nodos).  
  2. Un conjunto de arcos, donde cada arco es un par ordenado (origen, destino).

- **Representaciones más comunes**  
  1. **Lista de adyacencia**  
     - Para cada vértice, se guarda la lista de vértices a los que apunta.  
     - Ventaja: muy eficiente en espacio cuando el grafo es disperso.  
  2. **Matriz de adyacencia**  
     - Una tabla de valores binarios que indica si existe o no un arco entre dos vértices.  
     - Ventaja: consulta en tiempo constante.  
     - Desventaja: ocupa mucho espacio cuando hay pocos arcos.

- **Aplicaciones típicas**  
  - Modelado de dependencias entre tareas.  
  - Flujos de datos y rutas en redes con direcciones fijas.  
  - Máquinas de estado y grafos de decisión.

- **Taller (Ejercicios prácticos)**  
  1. **Construir las representaciones**  
     - A partir de un listado de arcos dirigidos, crea su lista de adyacencia y su matriz de adyacencia.  
  2. **Arborescencia de recubrimiento mínimo**  
     - Investiga o implementa el algoritmo de Edmonds para encontrar la arborescencia de coste mínimo en un grafo dirigido con raíz dada.  
  3. **Ruta más corta con heurística voraz (Dijkstra)**  
     - Desde un vértice origen, aplica Dijkstra: en cada paso selecciona el vértice no procesado con la distancia mínima acumulada y actualiza las distancias de sus sucesores.  
     - Este ejercicio muestra cómo funciona la estrategia de “óptimo local” en un problema real.
