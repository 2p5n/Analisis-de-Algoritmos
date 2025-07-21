## 2.1. Notación para el "orden de"

La notación del **orden de** (también llamada **notación asintótica**) se usa para describir cómo crece el tiempo o espacio que necesita un algoritmo en función del tamaño de entrada `n`, especialmente cuando `n` se hace muy grande.

### Tipos principales de notación:

#### 🔹 Notación O grande (`O(f(n))`)
- Describe una **cota superior** del crecimiento.
- Significa que el algoritmo **nunca será peor** que `f(n)` (a partir de cierto tamaño).
- Se usa para representar el **caso peor**.
- Ejemplo: `O(n²)` significa que el algoritmo no realiza más de `c·n²` operaciones para alguna constante `c`.

#### 🔹 Notación Omega (`Ω(f(n))`)
- Representa una **cota inferior** del crecimiento.
- El algoritmo **como mínimo** se comporta como `f(n)`.
- Se usa para describir el **mejor caso** o un límite inferior garantizado.
- Ejemplo: `Ω(n)` indica que al menos realiza `c·n` operaciones.

#### 🔹 Notación Theta (`Θ(f(n))`)
- Da una **cota ajustada**: indica que el algoritmo **siempre se comporta** como `f(n)` (ni más ni menos, salvo constantes).
- Se usa para describir el **crecimiento real y exacto**.
- Ejemplo: `Θ(n log n)` significa que el algoritmo se comporta proporcionalmente a `n log n` en todos los casos relevantes.

### Importancia del orden

Estas notaciones permiten:
- Comparar algoritmos sin necesidad de implementarlos.
- Estimar su rendimiento teórico.
- Elegir la mejor solución para grandes volúmenes de datos.

