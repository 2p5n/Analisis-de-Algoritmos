# Algoritmia Elemental

## Semana 5: 5. Algoritmos divide y vencerás

### 5.3. Mediana

#### Descripción detallada
- La mediana es el elemento que divide un arreglo ordenado en dos mitades (iguales o casi iguales).  
- Se puede encontrar de forma eficiente sin ordenar todo el arreglo usando Quickselect, que aprovecha la partición al estilo Quicksort.

#### Quickselect (Selección por partición)
1. Elegir un pivote (por ejemplo, aleatorio o usando la mediana de tres).  
2. Particionar el arreglo en tres grupos:
   - Elementos menores que el pivote.  
   - El pivote.  
   - Elementos mayores que el pivote.  
3. Contar cuántos elementos hay en el grupo de menores:
   - Si ese conteo más uno coincide con la posición que queremos (la mediana), ¡ya la tenemos!  
   - Si el conteo es mayor, recursar en el grupo de menores.  
   - Si es menor, recursar en el grupo de mayores ajustando la posición buscada.

#### Características de rendimiento
- Tiempo esperado lineal: cada partición reduce en promedio el tamaño del problema de forma constante.  
- En el peor caso, si siempre se elige un pivote desfavorable, puede degradarse a tiempo cuadrático.

#### Taller: Ejercicios prácticos
1. Implementar Quickselect y comparar su tiempo con ordenar completamente y luego tomar la mediana.  
2. Probar distintas estrategias de pivote: elección aleatoria, primer elemento o mediana de tres.  
3. Medir cuántas veces se elige un mal pivote y cómo afecta al tiempo de ejecución.

---

### 5.4. Multiplicación de matrices

#### Producto estándar
- Para multiplicar dos matrices cuadradas de mismo tamaño, cada elemento de la matriz resultado se calcula sumando productos de pares de elementos correspondientes de filas y columnas.  
- Este método clásico implica hacer tantas sumas y multiplicaciones como el cuadrado del tamaño de la matriz por ese tamaño.

#### Algoritmo de Strassen (divide y vencerás)
1. Dividir cada matriz en cuatro submatrices de igual tamaño.  
2. Calcular siete productos recursivos de estas submatrices (en lugar de ocho).  
3. Combinar esos resultados con sumas y restas para formar la matriz final.  
4. Esto reduce el número de operaciones respecto al método estándar y mejora el rendimiento para matrices grandes.

#### Taller: Ejercicios prácticos
1. Implementar la multiplicación clásica y medir tiempos para tamaños crecientes (por ejemplo 128, 256 y 512).  
2. Programar la versión de Strassen y comparar su rendimiento práctico frente al método estándar.  
3. Analizar el consumo de memoria y la estabilidad numérica en ambos algoritmos.
