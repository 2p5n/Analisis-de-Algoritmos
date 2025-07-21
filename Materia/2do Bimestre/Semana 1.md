# Algoritmia Elemental

## Semana 1: 4. Algoritmos voraces

### 4.1. Características
- Son rápidos y fáciles de implementar, ideales para problemas de optimización sencillos.  
- Siguen una heurística de “óptimo local” en cada paso, con la esperanza de encontrar un óptimo global tras varias iteraciones :contentReference[oaicite:0]{index=0}.
- **Ejemplos típicos**:
  - **Cambio de monedas**: usar la menor cantidad de monedas posibles para dar un cambio.  
  - **Selección de actividades**: elegir el máximo número de tareas que no se solapen.  
  - **Codificación de Huffman**: asignar códigos binarios de longitud mínima según frecuencias.

- **Ventajas**:
  - Implementación sencilla.  
  - Bajo costo computacional en muchos casos.  
  - A veces hallan la solución óptima :contentReference[oaicite:1]{index=1}.

- **Desventajas**:
  - No garantizan solución global óptima.  
  - Dificultad para diseñar la función de selección que asegure el mejor paso local :contentReference[oaicite:2]{index=2}.

### 4.2. Grafos no dirigidos
- **Árbol de recubrimiento mínimo (MST)**:  
  - Subgrafo árbol que conecta todos los vértices \(V\) de un grafo no dirigido \(G=(V,E)\).  
  - Minimiza la suma de pesos de las aristas seleccionadas.  
  - Aplicaciones: diseño de redes de distribución, comunicaciones y energía :contentReference[oaicite:3]{index=3}.

- **Algoritmos clásicos**:
  1. **Kruskal**  
     - Ordena todas las aristas por peso creciente.  
     - Itera añadiendo la mínima que no forme ciclo (usando estructura Union‑Find).  
     - Complejidad: \(O(E\log E)\).  
     - Demostración e implementación en Java disponibles en la unidad :contentReference[oaicite:4]{index=4}.  
  2. **Prim**  
     - Inicia en un vértice arbitrario.  
     - En cada paso, añade la arista de menor peso que conecte el árbol creciente con un vértice no incluido.  
     - Complejidad con montículo binario: \(O(E + V\log V)\).  
