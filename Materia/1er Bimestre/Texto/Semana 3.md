## 1.4. Caso peor

El **caso peor** (worst case) representa el escenario donde el algoritmo realiza **la mayor cantidad posible de operaciones** para una entrada de tamaño `n`.

### Características:
- Es una **cota superior garantizada** del comportamiento del algoritmo.
- Se usa para tener una **visión pesimista pero segura** del rendimiento.
- Importante cuando no se puede predecir el tipo de entrada (por ejemplo, en seguridad o sistemas críticos).

### Ejemplo:
En una búsqueda lineal en un arreglo sin ordenar:
- El caso peor ocurre cuando el elemento **no está en la lista** → se revisa todo → `O(n)`.

## 1.5. Operación elemental

Una **operación elemental** es una acción **básica e indivisible** que realiza un algoritmo, y que **consume una cantidad constante de tiempo** (`O(1)`).

### Ejemplos comunes:
- Comparaciones (`==`, `<`, `>`).
- Asignaciones (`x = 5`).
- Accesos a elementos de un arreglo (`A[i]`).
- Sumas, restas, multiplicaciones de enteros.
- Llamadas a funciones simples.

### ¿Por qué son importantes?
- Sirven para **medir la eficiencia** de un algoritmo contando cuántas operaciones elementales realiza.
- En el análisis, se asume que **todas valen lo mismo** (aunque en la práctica no siempre sea cierto).
