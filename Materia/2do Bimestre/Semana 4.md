# Algoritmia Elemental

## Semana 4: 5. Algoritmos divide y vencerás

### 5.2. Ordenación

#### 5.2.1. Ordenación por fusión (Merge Sort)

**Idea general**  
- Divide el arreglo en dos mitades recursivamente.  
- Ordena cada mitad de forma independiente.  
- Fusiona las dos mitades resultantes en un solo arreglo ordenado. :contentReference[oaicite:0]{index=0}

**Pseudocódigo (versión recursiva)**  

MergeSort(A[1…n]):
if n > 1 then
mid ← ⌊n/2⌋
U ← MergeSort(A[1…mid])
V ← MergeSort(A[mid+1…n])
return Merge(U, V)
else
return A


**Fusión de dos listas U y V**  

Merge(U, V):
i ← 1; j ← 1; W ← []
while i ≤ |U| and j ≤ |V| do
if U[i] ≤ V[j] then
append U[i] to W; i ← i + 1
else
append V[j] to W; j ← j + 1
append any remaining elements of U or V to W
return W


**Análisis de complejidad**  
- Recurrencia:  
  \[
    T(n) = 
      \begin{cases}
        c_1, & n = 1,\\
        2\,T(n/2) + c_2\,n, & n > 1.
      \end{cases}
  \]  
- Solución:  
  \[
    T(n) \in \Theta(n \log n).
  \] :contentReference[oaicite:1]{index=1}

**Características**  
- **Estable**: conserva el orden relativo de elementos iguales.  
- **Espacio extra**: requiere Θ(n) para la fusión.  
- **Uso típico**: arreglos muy grandes, entornos donde la estabilidad es crítica.

---

#### 5.2.2. Ordenación rápida (Quicksort)

**Idea general**  
- Selecciona un **pivote** (por ejemplo, el último elemento).  
- **Particiona** el arreglo en dos subarreglos:  
  - Elementos ≤ pivote (izquierda).  
  - Elementos > pivote (derecha).  
- Recursivamente aplica Quicksort a cada subarreglo. :contentReference[oaicite:2]{index=2}

**Pseudocódigo (versión Lomuto)**  

QuickSort(A[lo…hi]):
if lo < hi then
p ← Partition(A, lo, hi)
QuickSort(A, lo, p − 1)
QuickSort(A, p + 1, hi)

Partition(A, lo, hi):
pivot ← A[hi]
i ← lo
for j from lo to hi − 1 do
if A[j] ≤ pivot then
swap A[i] and A[j]; i ← i + 1
swap A[i] and A[hi]
return i

**Análisis de complejidad**  
- **Caso promedio**: Θ(n log n)  
- **Peor caso** (pivote siempre extremo): Θ(n²)  
- **Mejor caso** (división balanceada): Θ(n log n) :contentReference[oaicite:3]{index=3}

**Características**  
- **In‑place**: requiere espacio extra Θ(log n) para la pila de recursión.  
- **No estable**: puede cambiar el orden relativo de elementos iguales.  
- **Rendimiento práctico**: muy rápido en promedio; elegir buenos pivotes (aleatorio o mediano‑de‑tres).

