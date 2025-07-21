## Semana 3: 5. Algoritmos divide y vencerás

### 5.1. Búsqueda binaria

#### Descripción detallada
La búsqueda binaria es un método eficiente para localizar un elemento `x` en un arreglo ordenado `T[1…n]`. Funciona dividiendo repetidamente el rango de búsqueda por la mitad:

1. **Inicialización**  
   - Definir índices `izq = 1` y `der = n`.  
2. **Iteración**  
   - Mientras `izq` sea menor o igual que `der`:  
     1. Calcular el índice medio como la parte entera de la suma de los extremos dividida entre dos.  
     2. Comparar `T[medio]` con `x`:  
        - Si son iguales, retornar `medio`.  
        - Si el valor en `medio` es menor que `x`, continuar la búsqueda en la mitad derecha (actualizar `izq = medio + 1`).  
        - Si el valor en `medio` es mayor que `x`, continuar en la mitad izquierda (actualizar `der = medio - 1`).  
3. **Término**  
   - Si `izq` supera a `der`, el elemento no está en el arreglo; retornar “no encontrado”.

#### Ejemplo paso a paso  
Sea `T = [2, 5, 9, 14, 20, 27, 33]` y `x = 20`:

1. Empieza con `izq = 1`, `der = 7`. El medio cae en la posición 4, donde el valor es 14, menor que 20, así que actualizamos `izq = 5`.  
2. Ahora `izq = 5`, `der = 7`. El medio cae en la posición 6, donde el valor es 27, mayor que 20, así que actualizamos `der = 5`.  
3. Con `izq = 5`, `der = 5`, el medio es 5 y `T[5]` es 20, igual a `x`: ¡encontrado en la posición 5!

#### Complejidad  
- **Mejor caso**: si el primer punto medio coincide, la búsqueda termina de inmediato.  
- **Caso promedio y peor caso**: el número de pasos es proporcional al número de veces que se puede dividir el rango por dos, lo que crece de manera logarítmica respecto al tamaño del arreglo.

#### Ventajas  
- Muy eficiente para arreglos grandes.  
- Implementación sencilla.

#### Limitaciones  
- El arreglo debe estar previamente ordenado.  
- No es aplicable directamente a estructuras dinámicas sin acceso aleatorio.

#### Taller: Ejercicios prácticos  
1. **Implementaciones**  
   - Escribe la versión recursiva y la iterativa en pseudocódigo o en tu lenguaje favorito.  
2. **Variación con duplicados**  
   - Modifica la búsqueda para que, en caso de duplicados, retorne la primera aparición de `x`.  
3. **Comparación empírica**  
   - Mide y grafica el tiempo de búsqueda lineal frente a binaria en distintos tamaños de arreglo para ilustrar la diferencia de crecimiento logarítmico.
