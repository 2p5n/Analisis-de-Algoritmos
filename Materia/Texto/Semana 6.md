# Estructuras de control

## ¿Qué son las estructuras de control?
- Conjunto de instrucciones que permiten modificar el flujo de ejecución de un algoritmo.  
- Permiten que el algoritmo tome decisiones, repita procesos o siga una secuencia ordenada.  
- Se clasifican en Secuenciales, Condicionales y Repetitivas.

## Estructuras secuenciales
- Instrucciones que se ejecutan una tras otra en el orden en que se escriben.  
- No requieren decisiones ni condiciones.  
- Base para estructuras más complejas.  

```pseudocode
Leer A
Leer B
C ← A + B
Imprimir C

## Bucle `para` (iterativo)
- Repite un bloque de instrucciones un número determinado de veces.  
- Se utiliza cuando se conoce de antemano cuántas veces debe repetirse el ciclo.  
```pseudocode
Para i ← 1 hasta n hacer
   Instrucción(es)
FinPara

## Recursión
- Técnica en la cual una función se llama a sí misma para resolver un problema.  
- Útil cuando el problema puede dividirse en subproblemas similares más pequeños.  
- Elementos:  
  - **Caso base**: condición para detener la recursión.  
  - **Caso recursivo**: la función se llama a sí misma con una entrada modificada. 
```pseudocode
Función factorial(n)
   Si n = 0 entonces
      retornar 1
   Sino
      retornar n * factorial(n - 1)
FinFunción

## Bucle `mientras`
- Estructura de control que repite un bloque de instrucciones mientras se cumpla una condición booleana.  
- Se usa cuando no se sabe cuántas veces debe repetirse el ciclo.  
```pseudocode
x ← 1
Mientras x ≤ 5 hacer
   Imprimir x
   x ← x + 1
FinMientras
```