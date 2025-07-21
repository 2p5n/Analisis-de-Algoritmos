# Algoritmia Elemental

## Semana 4: 5. Algoritmos divide y vencerás

### 5.2. Ordenación

#### 5.2.1. Ordenación por fusión (Merge Sort)

**Idea general**  
- Divide el arreglo en dos mitades recursivamente.  
- Ordena cada mitad por separado.  
- Fusiona ambas mitades en un único arreglo ordenado.

**Pseudocódigo (versión recursiva)**

MergeSort(A[1…n]):
si n es mayor que 1 entonces
mid ← tamaño de A dividido entre 2 (entero)
U ← MergeSort(A[1…mid])
V ← MergeSort(A[mid+1…n])
regresar Merge(U, V)
sino
regresar A


**Fusión de dos listas U y V**

Merge(U, V):
i ← 1
j ← 1
W ← lista vacía
mientras i no supere el tamaño de U y j no supere el tamaño de V hacer
si U[i] es menor o igual que V[j] entonces
agregar U[i] al final de W
incrementar i
sino
agregar V[j] al final de W
incrementar j
agregar al final de W cualquier elemento restante de U o V
regresar W


**Características**  
- Estable: mantiene el orden relativo de elementos iguales.  
- Requiere espacio adicional proporcional al tamaño del arreglo, para la fusión.  
- Muy adecuada para arreglos grandes y cuando la estabilidad es importante.

---

#### 5.2.2. Ordenación rápida (Quicksort)

**Idea general**  
- Elegir un elemento como pivote (por ejemplo, el último).  
- Particionar el arreglo en dos partes:  
  - Elementos hasta el pivote.  
  - Elementos mayores que el pivote.  
- Aplicar Quicksort de forma recursiva a cada parte.

**Pseudocódigo (versión Lomuto)**

QuickSort(A[lo…hi]):
si lo es menor que hi entonces
p ← Partition(A, lo, hi)
QuickSort(A, lo, p − 1)
QuickSort(A, p + 1, hi)

Partition(A, lo, hi):
pivot ← A[hi]
i ← lo
para j desde lo hasta hi − 1 hacer
si A[j] es menor o igual que pivot entonces
intercambiar A[i] con A[j]
incrementar i
intercambiar A[i] con A[hi]
regresar i

**Características**  
- In‑place: solo requiere espacio extra para la pila de llamadas recursivas.  
- No es estable: el orden relativo de elementos iguales puede cambiar.  
- Muy eficiente en la práctica, especialmente si se elige bien el pivote (por ejemplo, al azar o usando la mediana de tres).
