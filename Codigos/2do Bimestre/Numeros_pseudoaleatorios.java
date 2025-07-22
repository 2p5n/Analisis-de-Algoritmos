public class Numeros_pseudoaleatorios {
    
    // Autor: Juan Diego Guerrero Camargo
        
    public static void main(String[] args) {
        // Parámetros del congruencial lineal
        int a = 1664525;
        int c = 1013904223;
        
        // Semilla
        int semilla = 123456789;
        
        // Constante para dividir: 2^32 = 4294967296
        double divisor = 4294967296.0;
        
        // Generamos 100 valores, pero solo imprimimos los primeros 10
        for (int i = 1; i <= 100; i++) {
            
            semilla = a * semilla + c;
            
            // Convertimos el int a [0,2^32-1] restando el valor minimo
            // y luego a [0,1) dividiendo por 2^32
            double u = (((double) semilla) - Integer.MIN_VALUE) / divisor;
            
            if (i <= 10) {
                System.out.printf("Valor %2d: %.8f%n", i, u);
            }
        }
    }
}


