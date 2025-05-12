public class MergeSort {

    public static void MERGE(int[] A, int p, int q, int r) {
        int nL = q - p + 1;        // length of A[p : q]
        int nR = r - q;            // length of A[q + 1 : r]
        int[] L = new int[nL];     // let L[0 : nL − 1] be new array
        int[] R = new int[nR];     // let R[0 : nR − 1] be new array

        // copy A[p : q] into L[0 : nL − 1]
        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i];
        }

        // copy A[q + 1 : r] into R[0 : nR − 1]
        for (int j = 0; j < nR; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0;  // i indexes the smallest remaining element in L
        int j = 0;  // j indexes the smallest remaining element in R
        int k = p;  // k indexes the location in A to fill

        // As long as each of the arrays L and R contains an unmerged element,
        // copy the smallest unmerged element back into A[p : r].
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i = i + 1;
            } else {
                A[k] = R[j];
                j = j + 1;
            }
            k = k + 1;
        }

        // Having gone through one of L and R entirely, copy the
        // remainder of the other to the end of A[p : r].
        while (i < nL) {
            A[k] = L[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < nR) {
            A[k] = R[j];
            j = j + 1;
            k = k + 1;
        }
    }

    public static void main(String[] args) {
        int[] A = {8, 3, 5, 2, 9, 1};  // arreglo de prueba
        int p = 0;
        int q = 2;
        int r = 5;

        // Llamada a MERGE: mezcla A[0:2] con A[3:5]
        MERGE(A, p, q, r);

        // Mostrar resultado
        System.out.println("Arreglo después de MERGE:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
