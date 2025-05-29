## ¿Qué es una recurrencia?
- Una ecuación que define el coste \(T(n)\) de un algoritmo en función de valores \(T\) de instancias más pequeñas.  
- Se usa para analizar algoritmos recursivos.

---

## 7.1. Tipos de recurrencias  
- **Lineales homogéneas:** \(T(n) = a\,T(n-1) + f(n)\).  
- **Divide y vencerás:** \(T(n) = a\,T(n/b) + f(n)\).  
- **No homogéneas:** incluyen términos desplazados o adicionales.

---

## 7.2. Métodos de solución

### 7.2.1. Sustitución  
1. Hipotetizar forma de la solución (por ejemplo, \(O(n\log n)\)).  
2. Demostrar por inducción que la hipótesis se cumple.

### 7.2.2. Expansión (árbol de recurrencias)  
- Dibujar niveles del árbol de llamadas.  
- Sumar el coste de cada nivel y contar niveles.  
- Usar suma de series para obtener la forma asintótica.

### 7.2.3. Teorema maestro  
Para \(T(n)=a\,T(n/b)+f(n)\):
- Si \(f(n)=O(n^{\log_b a - \varepsilon})\), entonces \(T(n)=\Theta(n^{\log_b a})\).  
- Si \(f(n)=\Theta(n^{\log_b a}\log^k n)\), entonces \(T(n)=\Theta(n^{\log_b a}\log^{k+1} n)\).  
- Si \(f(n)=\Omega(n^{\log_b a + \varepsilon})\) y la regularidad se cumple, \(T(n)=\Theta(f(n))\).

---

## 7.3. Ecuación característica  
Para recurrencias lineales con coeficientes constantes:
1. Asumir solución de la forma \(r^n\).  
2. Sustituir en la ecuación y resolver el polinomio en \(r\).  
3. Combinar raíces según condiciones iniciales.

*Ejemplo (Fibonacci):*  
\[
F_n = F_{n-1} + F_{n-2},\quad
r^2 - r - 1 = 0,\quad
r = \frac{1\pm\sqrt5}{2}.
\]
Solución:  
\[
F_n = \frac{\varphi^n - \psi^n}{\sqrt5}.
\]

---

## 7.4. Ejemplos de soluciones

| Recurrencia                   | Solución asintótica  |
|-------------------------------|----------------------|
| \(T(n)=T(n-1)+1\)             | \(\Theta(n)\)        |
| \(T(n)=T(n/2)+1\)             | \(\Theta(\log n)\)   |
| \(T(n)=2T(n/2)+n\)            | \(\Theta(n\log n)\)  |
| \(T(n)=T(n-1)+n\)             | \(\Theta(n^2)\)      |

---
