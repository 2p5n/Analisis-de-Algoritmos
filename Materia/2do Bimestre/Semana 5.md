# Algoritmia Elemental

## Semana 5: 5. Algoritmos divide y vencerás

### 5.3. Mediana

#### Descripción detallada  
- La **mediana** es el elemento que divide un arreglo ordenado de tamaño \(n\) en dos mitades iguales (o casi iguales).  
- Encontrar la mediana de forma **óptima** sin ordenar completamente el arreglo puede lograrse con el algoritmo **Quickselect**, que está basado en la misma idea de partición de Quicksort. :contentReference[oaicite:0]{index=0}

#### Quickselect (Selección por partición)  
1. **Elegir un pivote** \(p\) (por ejemplo, aleatorio o “mediano de tres”).  
2. **Particionar** el arreglo \(A[1…n]\) en tres grupos:  
   - \(L\): elementos \(< p\).  
   - \(\{p\}\).  
   - \(G\): elementos \(> p\).  
3. Sea \(|L|\) la cantidad de elementos en \(L\).  
   - Si \(|L| + 1 = k\), el pivote \(p\) es la \(k\)-ésima menor (la mediana si \(k=\lceil n/2\rceil\)).  
   - Si \(|L| \ge k\), recursar en \(L\).  
   - Si \(|L| + 1 < k\), recursar en \(G\) buscando la \((k - |L| - 1)\)-ésima posición.  

#### Complejidad  
- **Tiempo esperado:** \(\Theta(n)\) en el caso promedio, ya que cada partición reduce en promedio el tamaño del problema a una fracción constante de \(n\).  
- **Peor caso:** \(\Theta(n^2)\) si se elige siempre el peor pivote (por ejemplo, el elemento mínimo o máximo). :contentReference[oaicite:1]{index=1}

#### Taller: Ejercicios prácticos  
1. Implementar Quickselect en su lenguaje favorito y comparar tiempos con una ordenación completa seguida de acceso.  
2. Experimentar con diferentes estrategias de elección de pivote: aleatorio, primer elemento, mediano de tres.  
3. Analizar empíricamente la frecuencia de malos pivotes y su impacto en el tiempo de ejecución.

---

### 5.4. Multiplicación de matrices

#### Producto estándar  
Dadas dos matrices cuadradas \(A\) y \(B\) de tamaño \(n\times n\), su producto \(C = A \times B\) se define por:  
\[
  C_{i,j} \;=\; \sum_{k=1}^{n} A_{i,k}\,\times\,B_{k,j}
\]  
- **Complejidad:** \(\Theta(n^3)\) al realizar \(n^2\) sumas y multiplicaciones cada una de \(n\) términos. :contentReference[oaicite:2]{index=2}

#### Algoritmo de Strassen (divide y vencerás)  
1. Dividir cada matriz en cuatro submatrices de tamaño \(\tfrac{n}{2}\times\tfrac{n}{2}\).  
2. Calcular 7 productos recursivos de estas submatrices en lugar de 8 (como en la multiplicación estándar).  
3. Combinar los resultados con sumas y restas para obtener las 4 submatrices de \(C\).  
4. **Complejidad:** \(\Theta(n^{\log_2 7})\approx \Theta(n^{2.81})\), mejor que el \(\Theta(n^3)\) clásico.

#### Taller: Ejercicios prácticos  
1. Implementar la multiplicación naïve y medir tiempos para \(n=128,256,512\).  
2. Programar la versión de Strassen y comparar su rendimiento práctico frente al método estándar.  
3. Analizar consumo de memoria y estabilidad numérica en ambos algoritmos.  
