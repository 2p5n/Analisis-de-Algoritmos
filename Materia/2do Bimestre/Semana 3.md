# Algoritmia Elemental

## Semana 3: 5. Algoritmos divide y vencerás

### 5.1. Búsqueda binaria

#### Descripción detallada
La búsqueda binaria es un método eficiente para localizar un elemento `x` en un arreglo **ordenado** `T[1…n]`. Funciona dividiendo repetidamente el rango de búsqueda por la mitad:

1. **Inicialización**  
   - Definir índices `izq = 1` y `der = n`.  
2. **Iteración**  
   - Mientras `izq ≤ der`:  
     1. Calcular el índice medio  
        \[
          \text{medio} = \left\lfloor \frac{izq + der}{2} \right\rfloor.
        \]  
     2. Comparar `T[medio]` con `x`:  
        - Si `T[medio] == x`, retornar `medio`.  
        - Si `T[medio] < x`, entonces el valor buscado está en la mitad **derecha**, actualizar `izq = medio + 1`.  
        - Si `T[medio] > x`, entonces está en la mitad **izquierda**, actualizar `der = medio - 1`.  
3. **Término**  
   - Si `izq > der`, `x` no existe en el arreglo; retornar “no encontrado”.

#### Ejemplo paso a paso  
Supongamos `T = [2, 5, 9, 14, 20, 27, 33]` y `x = 20`:
1. `izq = 1`, `der = 7` → `medio = ⌊(1+7)/2⌋ = 4` → `T[4] = 14 < 20` → buscar en derecha → `izq = 5`.  
2. `izq = 5`, `der = 7` → `medio = ⌊(5+7)/2⌋ = 6` → `T[6] = 27 > 20` → buscar en izquierda → `der = 5`.  
3. `izq = 5`, `der = 5` → `medio = 5` → `T[5] = 20 == x` → ¡encontrado en posición 5!

#### Complejidad  
- **Mejor caso** (elemento en la primera comprobación): Θ(1).  
- **Caso promedio y peor**: Θ(log n), pues cada paso reduce el rango a la mitad :contentReference[oaicite:0]{index=0}.

#### Ventajas y limitaciones  
- **Ventajas**  
  - Muy eficiente para arreglos grandes.  
  - Fácil de implementar.  
- **Limitaciones**  
  - Requiere arreglo precargado y ordenado.  
  - No sirve para estructuras dinámicas sin acceso aleatorio.  

#### Taller: Ejercicios prácticos  
1. **Implementación en pseudocódigo**  
   - Escribir el algoritmo recursivo y la versión iterativa.  
2. **Análisis de variaciones**  
   - ¿Cómo adaptar la búsqueda binaria para encontrar la primera ocurrencia de `x` si el arreglo contiene duplicados?  
3. **Comparación empírica**  
   - Medir tiempos de búsqueda lineal vs. binaria en arreglos de distintos tamaños e ilustrar la diferencia logarítmica.
