## 2.2. Notación Omega (`Ω`)

La notación **Omega** (`Ω(f(n))`) describe una **cota inferior** del crecimiento de un algoritmo.  
Es decir, garantiza que el algoritmo **como mínimo** requerirá un cierto número de operaciones proporcional a `f(n)`.

### Definición formal:
Una función `T(n)` pertenece a `Ω(f(n))` si existen constantes positivas `c` y `n₀` tales que:

```
T(n) ≥ c·f(n)    para todo n ≥ n₀
```

### Uso:
- Se utiliza para describir el **mejor caso** o la **eficiencia mínima** que se puede esperar.
- También se usa para demostrar límites inferiores teóricos de ciertos problemas.

### Ejemplo:
- En una búsqueda lineal:
  - Mejor caso: el elemento está al inicio → `Ω(1)`

## 2.3. Notación Theta (`Θ`)

La notación **Theta** (`Θ(f(n))`) representa una **cota ajustada**: significa que el algoritmo se comporta **exactamente como `f(n)`**, tanto en el mejor como en el peor caso (salvo constantes).

### Definición formal:
Una función `T(n)` pertenece a `Θ(f(n))` si existen constantes positivas `c₁`, `c₂` y `n₀` tales que:

```
c₁·f(n) ≤ T(n) ≤ c₂·f(n)    para todo n ≥ n₀
```

### Uso:
- Se usa cuando se puede determinar el comportamiento **exacto** de un algoritmo.
- Ideal para comparar la eficiencia real de varios métodos.

### Ejemplo:
- Merge Sort tiene complejidad `Θ(n log n)` en todos los casos.

## 2.4. Notación asintótica condicional

La **notación asintótica condicional** analiza el comportamiento de un algoritmo **bajo ciertas condiciones o restricciones** sobre la entrada.

### ¿Qué significa?
- No se analiza el peor, mejor o caso medio **de forma general**, sino que se dice:
  > *“Si la entrada tiene tal propiedad, el algoritmo se comporta como O(f(n))”*.

### Ejemplo:
- Un algoritmo de ordenamiento puede tener:
  - `O(n)` **si la entrada ya está ordenada**.
  - `O(n²)` **en el caso general o si está en orden inverso**.

### Aplicación:
- Muy útil para optimizar programas en contextos reales, donde se conoce algo del tipo de datos que se van a procesar.
- Permite razonar con mayor precisión y adaptar algoritmos a situaciones específicas.