# Recurrencias

## Recurrencias
- El tiempo de ejecución de algoritmos recursivos se expresa mediante relaciones recursivas.  
- Una relación de recurrencia define una función en términos de instancias más pequeñas de sí misma (por ejemplo, n!). :contentReference[oaicite:6]{index=6}

## Solución de recurrencias
- **Suposiciones inteligentes**:  
  1. Calcular los primeros valores de la recurrencia.  
  2. Buscar una regularidad.  
  3. Inventar una forma general.  
  4. Demostrar por inducción matemática u otro método. :contentReference[oaicite:7]{index=7}  
- **Ecuación característica**: asumir una solución de la forma \(r^n\) y resolver la ecuación resultante. :contentReference[oaicite:8]{index=8}

## Ejemplos

### Caso Lineal
\[
T(n) = T(n-1) + 1,\quad T(0)=0
\quad\Longrightarrow\quad
T(n)=n.
\] :contentReference[oaicite:9]{index=9}

### Caso Tipo Maestro
\[
T(n)=3\,T\bigl(\tfrac n2\bigr) + n,\quad T(0)=0.
\]
Valores calculados:
- \(T(1)=3T(0)+1=1\).  
- \(T(2)=3T(1)+2=5\).  
- \(T(4)=3T(2)+4=19\).  
- \(T(8)=3T(4)+8=65\).  
- \(T(16)=3T(8)+16=211\).  
- \(T(32)=3T(16)+32=665\). :contentReference[oaicite:10]{index=10}  

Aplicando el Teorema maestro:  
\[
T(n)=\Theta(n\log n).
\]
