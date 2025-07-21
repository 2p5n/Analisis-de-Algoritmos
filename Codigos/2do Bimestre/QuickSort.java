public class QuickSort {
    
        public static void main(String[] args) {
        int[] datos = {3, 1, 4, 1, 5, 9, 2};
        System.out.println("Antes de ordenar:");
        for (int n : datos) System.out.print(n + " ");
        System.out.println();

        quickSort(datos, 0, datos.length - 1);

        System.out.println("Despues de ordenar:");
        for (int n : datos) System.out.print(n + " ");
    }
    // Metodo de ordenamiento
    public static void quickSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int pivotePos = particionar(arr, izq, der);
            quickSort(arr, izq, pivotePos - 1);   // Ordena izquierda
            quickSort(arr, pivotePos + 1, der);   // Ordena derecha
        }
    }
    
     // Metodo para devolver la posicion del pivote
    private static int particionar(int[] arr, int izq, int der) {
        int pivote = arr[der];
        int i = izq;
        for (int j = izq; j < der; j++) {
            if (arr[j] <= pivote) {
                // Intercambia arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        // Coloca el pivote en su posición correcta
        int temp = arr[i];
        arr[i] = arr[der];
        arr[der] = temp;
        return i;
    }
}
