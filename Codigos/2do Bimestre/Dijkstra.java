import java.util.*;

// Autor: Juan Diego Guerrero Camargo

public class Dijkstra {

    static List<String> aristas = new ArrayList<>();

    public static void main(String[] args) {
        int V = 6;
        int[][] grafo = new int[V][V];

        // Inicializar la matriz con "infinito" para representar ausencia de conexión
        for (int i = 0; i < V; i++) {
            Arrays.fill(grafo[i], Integer.MAX_VALUE);
        }

        // Agregar aristas (origen, destino, peso) — nodos desde 1
        agregarArista(grafo, 1, 2, 6);
        agregarArista(grafo, 1, 3, 1);
        agregarArista(grafo, 1, 4, 5);
        agregarArista(grafo, 2, 5, 3);
        agregarArista(grafo, 3, 5, 6);
        agregarArista(grafo, 3, 6, 4);
        agregarArista(grafo, 4, 6, 2);
        agregarArista(grafo, 5, 6, 6);

        // Mostrar las aristas
        System.out.println("Aristas del grafo dirigido:");
        for (String a : aristas) {
            System.out.println(a);
        }

        // Mostrar la matriz de adyacencia
        System.out.println("\nMatriz de adyacencia:");
        mostrarGrafo(grafo);

        // Ejecutar Dijkstra desde el nodo 1
        int origen = 1;
        dijkstra(grafo, origen);
    }

    static void agregarArista(int[][] grafo, int u, int v, int peso) {
        grafo[u - 1][v - 1] = peso;
        aristas.add("(" + u + " -> " + v + " : " + peso + ")");
    }

    static void mostrarGrafo(int[][] grafo) {
        int V = grafo.length;

        // Encabezado de columnas
        System.out.print("\t");
        for (int j = 1; j <= V; j++) {
            System.out.print(j + "\t");
        }
        System.out.println();

        for (int i = 0; i < V; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < V; j++) {
                if (grafo[i][j] == Integer.MAX_VALUE) {
                    System.out.print("-\t");
                } else {
                    System.out.print(grafo[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    static void dijkstra(int[][] grafo, int origen) {
        int V = grafo.length;
        int[] dist = new int[V];        // distancias mínimas desde el origen
        boolean[] visitado = new boolean[V];  // nodos ya visitados
        int[] previo = new int[V];      // para reconstruir el camino

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(previo, -1);
        dist[origen - 1] = 0;

        for (int i = 0; i < V - 1; i++) {
            // Seleccionar nodo con menor distancia no visitado
            int u = minimo(dist, visitado);
            visitado[u] = true;

            System.out.println("\nVisitando el nodo " + (u + 1) + " (distancia actual minima: " + dist[u] + ")");

            // Evaluar todos los vecinos del nodo actual
            for (int v = 0; v < V; v++) {
                if (!visitado[v] && grafo[u][v] != Integer.MAX_VALUE &&
                    dist[u] + grafo[u][v] < dist[v]) {

                    int nuevaDistancia = dist[u] + grafo[u][v];

                    // Actualizar mejor distancia conocida
                    dist[v] = nuevaDistancia;
                    previo[v] = u; // guardar de dónde se llegó a v

                    System.out.println("  Se mejora la distancia a nodo " + (v + 1) +
                                       "  Nueva distancia: " + nuevaDistancia +
                                       " (pasando por nodo " + (u + 1) + ")");
                }
            }
        }

        // Imprimir resultado final
        System.out.println("\nDistancias minimas desde el vertice " + origen + ":");
        for (int i = 0; i < V; i++) {
            System.out.print("Hasta " + (i + 1) + ": ");
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("- (sin conexión)");
            } else {
                System.out.print(dist[i] + " | Ruta: ");
                imprimirRuta(previo, i);
                System.out.println((i + 1));
            }
        }
    }

    // Función para imprimir el camino desde el origen hasta el nodo destino
    static void imprimirRuta(int[] previo, int destino) {
        if (previo[destino] == -1) return;
        imprimirRuta(previo, previo[destino]);
        System.out.print((previo[destino] + 1) + " -> ");
    }

    // Encuentra el nodo no visitado con menor distancia
    static int minimo(int[] dist, boolean[] visitado) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visitado[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
