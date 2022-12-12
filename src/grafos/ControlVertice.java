package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ildefonso Lares (233381) Hugo Navarro (233470)
 */
public class ControlVertice {
    private List<Vertice> vertices;
    
    /**
     * Constructor que inicializa una lista de vértice a un tipo ArrayList
     */
    public ControlVertice (){
        vertices = new ArrayList<>();
    }
    
    /**
     * Busca un vértice dentro de la lista de vértices.
     * @param vertice vértice a buscar dentro de la lita.
     * @return regresa un vértice en caso de existir en la lista. Null en caso contrario.
     */
    public Vertice obtenVertice(Vertice vertice){
        Vertice buscar = null;
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getNombre().equalsIgnoreCase(vertice.getNombre())){
                buscar = vertices.get(i);
            }
        }
        return buscar;
    }
    /**
     * Agrega un vértice a la lista de vertices en caso de que no se encuentre registrada.
     * @param vertice vértice recibido para ser agregado a la lista.
     */
    public void agregaVertice(Vertice vertice){
        Vertice agregar = obtenVertice(vertice);
        if (agregar == null){
            vertices.add(vertice);
        }else{
            System.out.println("No se puede agregar la ciudad porque ya está registrada.");
        }
    }
    /**
     * Elimina un vértice de la lista de vértices.
     * @param vertice vértice a eliminar.
     */
    public void eliminarVertice(Vertice vertice){
        Vertice eliminar = obtenVertice(vertice);
        if (eliminar != null){
            vertices.get(vertices.indexOf(eliminar)).modificaContador();
            vertices.remove(eliminar);
            
        }else{
            System.out.println("La ciudad no se puede eliminar porque no está registrada.");
        }
    }
    /**
     * Regresa una lista con todos los vértices.
     * @return lista de vértices.
     */
    public List<Vertice> listaVertices(){
        return vertices;
    }
    
    /**
     * Lista de nombres de los vertices
     * 
     * @return nombre de los vertices
     */
    public String[] arregloNombres(){
        String[] arregloNombres = new String[vertices.size()];
        for (int i = 0; i < vertices.size(); i++) {
            arregloNombres[i] = vertices.get(i).getNombre();
        }
        return arregloNombres;
    }
    
    //Imprime el nombre de todos los vertices
    public void imprimeVetices(){
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println("Ciudad "+(i)+": "+vertices.get(i).getNombre());
        }
    }
    
}
