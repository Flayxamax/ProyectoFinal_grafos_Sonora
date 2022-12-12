package grafos;

/**
 *
 * @author Ildefonso Lares (233381) Hugo Navarro (233470)
 */
public class Vertice {
    private String nombre;
    private int numVertice;
    private static int contador = 0;
    /**
     * Constructor por omisión.
     */
    public Vertice(){
        
    }
    /**
     * Constructor que inicializa el nombre de un vértice
     * @param nombre nombre de la ciudad a la que representa este vértice
     */
    public Vertice (String nombre){
        this.nombre = nombre;
        numVertice = contador;
        contador ++;
    }
    /**
     * Regresa el nombre del vértice.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna el nombre del vértice.
     * @param nombre nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Regresa el número que se le ha establecido a un vértice.
     * @return entero con el número del vértice.
     */
    public int getNumVertice() {
        return numVertice;
    }
    /**
     * Asigna el número del vértice.
     * @param numVertice número a establecerle al vértice.
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
    
    public void modificaContador(){
        numVertice--;
    }

}
