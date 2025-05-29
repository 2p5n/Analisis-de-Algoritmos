package fibonacci;

/**
 *
 * @author jdgue
 */
public class Fibonacci { 
    public static int fib(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

    public static void main(String[] args) {
        // Ejemplo de uso:
        int n = 10;
        System.out.println("fib(" + n + ") = " + fib(n));
    }
}
