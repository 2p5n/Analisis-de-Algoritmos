import java.util.*;

// Autor: Juan Diego Guerrero Camargo

public class Kruskal {
    
        public static void main(String[] args) {
        int V = 6;  // vértices del 0 al 5 

        // Definimos las aristas en un arreglo
        Arista[] aristas = {
            new Arista(0,1,6),
            new Arista(0,2,1),
            new Arista(0,3,5),
            new Arista(1,4,3),
            new Arista(2,4,6),
            new Arista(2,5,4),
            new Arista(3,5,2),
            new Arista(4,5,6)
        };

        // 1) Ordenamiento por selección según peso
        for (int i = 0; i < aristas.length - 1; i++) { 
            int k = i;
            for (int j = i + 1; j < aristas.length; j++) {
                if (aristas[j].peso < aristas[k].peso) {
                    k = j;
                }
            }
            // intercambiar aristas[i] y aristas[k]
            Arista temp = aristas[i];
            aristas[i] = aristas[k];
            aristas[k] = temp;
        }

        // Mostrar aristas ordenadas
        System.out.print("Aristas ordenadas: ");
        for (Arista a : aristas) System.out.print(a + " ");
        System.out.println("\n");

        // 2) Inicializar Unión‑Find (DSU)
        padre = new int[V];
        rango = new int[V];
        for (int i = 0; i < V; i++) padre[i] = i;

        // 3) Construir Arbol de recubrimiento minimo (MST)
        List<Arista> mst = new ArrayList<>();
        int pesoTotal = 0;
        System.out.println("Proceso de Kruskal:");
        for (Arista a : aristas) {
            System.out.print("Compruebo " + a + " -> ");
            if (unir(a.origen, a.destino)) {
                mst.add(a);
                pesoTotal += a.peso;
                System.out.println("se agrega");
            } else {
                System.out.println("se descarta (ciclo)");
            }
        }

        // 4) Mostrar resultado
        System.out.print("\nArbol de recubrimiento minimo: ");
        
        for (Arista a : mst) 
            System.out.print(a + " ");
        
        System.out.println("\nPeso total del Arbol: " + pesoTotal);
    }
        
    // Clase que representa una arista
    static class Arista {
        int origen, destino, peso;
        Arista(int o, int d, int p) {
            origen = o;
            destino = d;
            peso = p;
        }
        @Override
        public String toString() {
            return "(" + origen + "-" + destino + ":" + peso + ")";
        }
    }

    // Unión‑Find (D)
    static int[] padre;
    static int[] rango;

    static int encontrar(int x) {
        if (padre[x] != x) {
            padre[x] = encontrar(padre[x]);
        }
        return padre[x];
    }

    static boolean unir(int a, int b) {
        int ra = encontrar(a);
        int rb = encontrar(b);
        if (ra == rb) return false;
        if (rango[ra] < rango[rb]) {
            padre[ra] = rb;
        } else if (rango[rb] < rango[ra]) {
            padre[rb] = ra;
        } else {
            padre[rb] = ra;
            rango[ra]++;
        }
        return true;
    }
}
