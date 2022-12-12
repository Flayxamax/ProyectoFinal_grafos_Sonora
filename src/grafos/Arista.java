package grafos;

/**
 *
 * @author Ildefonso Lares (233381) Hugo Navarro (233470)
 */
public class Arista {
    private Vertice origen;
    private Vertice destino;
    private int km;
    private int precio;

    /**
     * Constructor por omisión.
     */
    public Arista(){
        
    }
    /**
     * Constructor que inicializa el vértice de destino.
     * @param destino Vértice de destino que se dirige el vértice origen.
     */
    public Arista(Vertice origen, Vertice destino){
        this.origen = origen;
        this.destino = destino;
    }
    /**
     * Constructor que inicializa el vértice de destino, la distancia del camino y el costo del peaje.
     * @param destino vértice de destino al cual se dirige el vértice origen.
     * @param km distancia entre el vértice origen y el vértice de destino.
     * @param precio costo de peaje de la distancia entre los dos vértices.
     */
    public Arista(Vertice origen, Vertice destino, int km, int precio){
        this.origen = origen;
        this.destino = destino;
        this.km = km;
        this.precio = precio;
    }
    /**
     * Regresa el vértice de origen.
     * @return vértice de origen.
     */
    public Vertice getOrigen() {
        return origen;
    }
    /**
     * Asigna el vértice de origen.
     * @param origen vértice de origen.
     */
    public void setOrigen(Vertice origen) {
        this.origen = origen;
    }
    /**
     * Regresa el vértice de destino.
     * @return vértice de destino.
     */
    public Vertice getDestino() {
        return destino;
    }
    /**
     * Asigna el vértice de destino.
     * @param destino vértice de destino.
     */
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }
    /**
     * Regresa la distancia entre dos vértices.
     * @return la distancia.
     */
    public int getKm() {
        return km;
    }
    /**
     * Asigna la distancia entre dos vértices.
     * @param km distancia.
     */
    public void setKm(int km) {
        this.km = km;
    }
    /**
     * Regresa el precio de peaje de la distancia entre dos vértices.
     * @return el precio de peaje de la distancia entre dos vértices.
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * Asigna el precio de la distancia entre dos vértices.
     * @param precio de peaje entre los dos vertices.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }    
}
