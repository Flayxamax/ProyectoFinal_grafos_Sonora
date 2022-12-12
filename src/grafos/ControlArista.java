package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ildefonso Lares (233381) Hugo Navarro (233470)
 */
public class ControlArista {

    private List<Arista> colindancias;

    /**
     * Constructor por omisión
     */
    public ControlArista() {
        colindancias = new ArrayList<>();
    }

    /**
     * Obtiene un entero con la ubicación de una arista de la lista de colindancias.
     *
     * @param arista arista a buscar dentro de la lista de colindancias.
     * @return entero con la ubicación de la arista dentro de la lista de colindancias. -1 en caso de que no se encuentre en la lista.
     */
    public Arista obtenColindancia(Arista arista) {
        Arista colindancia = null;
        for (int i = 0; i < colindancias.size(); i++) {
            if (colindancias.get(i).getOrigen().getNombre().equalsIgnoreCase(arista.getOrigen().getNombre()) && colindancias.get(i).getDestino().getNombre().equalsIgnoreCase(arista.getDestino().getNombre())) {
                colindancia = colindancias.get(i);
                break;
            }
        }
        return colindancia;
    }

    /**
     * Registra una arista dentro de la lista de colindancias.
     *
     * @param arista arista a agregar en la lista de colindancias.
     */
    public void registrarColindancia(Arista arista) {
        if (obtenColindancia(arista) == null) {
            colindancias.add(arista);
        } else {
            System.out.println("No se puede registrar porque la colindancia ya existe.");
        }
    }

    /**
     * Modifica una arista dentro de la lista de colindancias.
     *
     * @param arista arista con los parámetros modificados.
     */
    public void modificarColindancia(Arista arista) {
        if (obtenColindancia(arista) != null) {
            colindancias.set(colindancias.indexOf(arista), arista);
        } else {
            System.out.println("No se puede modificar la colindancia.");
        }
    }

    /**
     * Elimina una arista dentro de la lista de colindancias.
     *
     * @param arista arista a eliminar.
     */
    public void eliminarColindancia(Arista arista) {
        if (obtenColindancia(arista) != null) {
            colindancias.remove(obtenColindancia(arista));
        } else {
            System.out.println("No se puede eliminar la colindancia porque no existe.");
        }
    }

    /**
     * Regresa una lista con todas las colindancias de un vértice específico.
     *
     * @return
     */
    public List<Arista> getColindancias() {
        return colindancias;
    }

    /**
     * Regresa una lista de colindancias que coincidan con el vértice de origen recibido en el parámetro.
     *
     * @param nombre nombre del vértice de origen.
     * @return Lista con todas las colindancias que tengan por origen el parámetro recibido.
     */
    public List<Arista> getColindanciasOrigen(String nombre) {
        List<Arista> colindanciaOrigen = new ArrayList<>();
        for (int i = 0; i < colindancias.size(); i++) {
            if (colindancias.get(i).getOrigen().getNombre().equalsIgnoreCase(nombre)) {
                colindanciaOrigen.add(colindancias.get(i));
            }
        }
        return colindanciaOrigen;
    }

    /**
     * Método de impresión de colindancias
     */
    public void imprimeColindancias() {
        for (int i = 0; i < colindancias.size(); i++) {
            System.out.println("✮ Colindancia " + (i + 1) + ": - Ciudad de origen: " + colindancias.get(i).getOrigen().getNombre() + " - Ciudad de destino: " + colindancias.get(i).getDestino().getNombre() + " - Distancia: " + colindancias.get(i).getKm() + " - Costo: " + colindancias.get(i).getPrecio());
            System.out.println("");
        }
    }

    /**
     * Regresa una matriz de enteros con las distancias entre dos vértices
     *
     * @param numVertices parámetro a recibir para inicializar las dimensiones del arreglo.
     * @return matriz de tipo entero con las distancias entre dos vértices.
     */
    public int[][] arregloColindancias(int numVertices) {
        int arreglo[][] = new int[numVertices][numVertices];
        for (int i = 0; i < colindancias.size(); i++) {
            int a = colindancias.get(i).getOrigen().getNumVertice();
            int b = colindancias.get(i).getDestino().getNumVertice();
            arreglo[a][b] = colindancias.get(i).getKm();
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i][j] == 0) {
                    arreglo[i][j] = 0xFFFF;
                }
            }
        }
        return arreglo;
    }

    public int[][] arregloPrecios(int numVertices) {
        int arreglo[][] = new int[numVertices][numVertices];
        for (int i = 0; i < colindancias.size(); i++) {
            int a = colindancias.get(i).getOrigen().getNumVertice();
            int b = colindancias.get(i).getDestino().getNumVertice();
            arreglo[a][b] = colindancias.get(i).getPrecio();
        }
        return arreglo;
    }

    public int[][] arregloDistancias(int numVertices) {
        int arreglo[][] = new int[numVertices][numVertices];
        for (int i = 0; i < colindancias.size(); i++) {
            int a = colindancias.get(i).getOrigen().getNumVertice();
            int b = colindancias.get(i).getDestino().getNumVertice();
            arreglo[a][b] = colindancias.get(i).getKm();
        }
        return arreglo;
    }

}
