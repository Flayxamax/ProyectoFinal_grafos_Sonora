/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Ildefonso Lares (233381) Hugo Navarro (233470)
 */
public class rutaBarata {

    int[][] pesos;
    int[] ultimo;
    int[] D;
    boolean[] F;
    int s, n;
    String[] nombres;

    /**
     * Constructor que inicializa algunos parámetros al valor de sus variables.
     *
     * @param pesos
     * @param origen
     * @param nombres
     */
    public rutaBarata(int[][] pesos, int origen, String[] nombres) {
        this.pesos = pesos;
        n = pesos.length;
        s = origen;
        ultimo = new int[n];
        D = new int[n];
        F = new boolean[n];
        this.nombres = nombres;
    }

    /**
     * Método para encontrar el camino mímono entre el origen y el destino.
     */
    public void caminoMinimos() {
        // valores iniciales
        for (int i = 0; i < n; i++) {
            F[i] = false;
            D[i] = pesos[s][i];
            ultimo[i] = s;
        }
        F[s] = true;
        D[s] = 0;
        // Pasos para marcar los n-1 vértices
        for (int i = 1; i < n; i++) {
            int v = minimo();
            //selecciona vértice no marcado de menor distancia
            F[v] = true;
            // actualiza distancia de vértices no marcados
            for (int w = 1; w < n; w++) {
                if (!F[w]) {
                    if ((D[v] + pesos[v][w]) < D[w]) {
                        D[w] = D[v] + pesos[v][w];
                        ultimo[w] = v;
                    }
                }
            }
        }
    }

    /**
     * Método para encontrar el árbol recubridor mínimo
     *
     * @return
     */
    private int minimo() {
        int mx = 0xFFFF;
        int v = 1;
        for (int j = 1; j < n; j++) {
            if (!F[j] && (D[j] <= mx)) {
                mx = D[j];
                v = j;
            }
        }
        return v;
    }

    /**
     * Método para imprimir el camino más corto.
     *
     * @param v index del vértice de destino.
     */
    public void recuperaCamino(int v) {
        int anterior = ultimo[v];
        if (v != s) {
            recuperaCamino(anterior); // vuelve al último del último
            System.out.print(" -> " + nombres[v]);
        } else {
            System.out.print(nombres[s]);
        }
    }

}
