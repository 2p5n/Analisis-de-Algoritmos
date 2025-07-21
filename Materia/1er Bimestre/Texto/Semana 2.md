## 1.2. Eficiencia de los algoritmos

La eficiencia mide **qué tan rápido o cuánta memoria necesita un algoritmo** para resolver un problema.

### Tipos de eficiencia:
- **Temporal (tiempo)**: ¿Cuántas operaciones realiza el algoritmo?
- **Espacial (memoria)**: ¿Cuánta memoria necesita?

### Notación asintótica:
- Se expresa en función del tamaño de la entrada `n`.
- Se busca el **comportamiento en el peor de los casos (peor caso o "worst-case")**.
- Ejemplos:
  - Algoritmo lineal: `O(n)`
  - Algoritmo cuadrático: `O(n²)`
  - Algoritmo logarítmico: `O(log n)`

Evaluar eficiencia ayuda a **elegir la mejor solución** entre varias opciones que resuelven lo mismo.

---

## 1.3. Caso medio

El **caso medio** analiza el comportamiento de un algoritmo **bajo condiciones promedio**, no el peor ni el mejor caso.

### ¿Por qué es útil?
- Representa una situación más realista en aplicaciones prácticas.
- Permite comparar algoritmos que tienen el mismo peor caso, pero distinto comportamiento promedio.

### Ejemplo:
- En búsqueda lineal:
  - **Mejor caso**: el elemento está al inicio → `O(1)`
  - **Peor caso**: el elemento está al final o no está → `O(n)`
  - **Caso medio**: el elemento está en una posición aleatoria → `O(n/2) ≈ O(n)`
