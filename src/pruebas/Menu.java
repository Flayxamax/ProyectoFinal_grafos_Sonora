package pruebas;

import grafos.Arista;
import grafos.ControlArista;
import grafos.Vertice;
import grafos.ControlVertice;
import java.util.Scanner;
import metodos.Dijkstra;
import metodos.rutaBarata;

/**
 *
 * @author Ildefonso Lares (233381) Hugo Navarro (233470)
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ControlVertice vertices = new ControlVertice();
        Vertice vertice = new Vertice();
        ControlArista aristas = new ControlArista();
        Arista arst = new Arista();
        Scanner tec = new Scanner(System.in);
        int opcion = 0;

        Vertice v1 = new Vertice("Navojoa");
        Vertice v2 = new Vertice("Obregon");
        Vertice v3 = new Vertice("Empalme");
        Vertice v4 = new Vertice("Guaymas");
        Vertice v5 = new Vertice("SanCarlos");
        Vertice v6 = new Vertice("Hermosillo");
        Vertice v7 = new Vertice("Ures");
        Vertice v8 = new Vertice("SantaAna");
        Vertice v9 = new Vertice("Magadalena");
        Vertice v10 = new Vertice("Cananea");
        Vertice v11 = new Vertice("BahiaKino");
        Vertice v12 = new Vertice("Caborca");
        Vertice v13 = new Vertice("PueroPeñasco");
        Vertice v14 = new Vertice("Sonoyta");
        Vertice v15 = new Vertice("SanLuisRioColorado");

        vertices.agregaVertice(v1);
        vertices.agregaVertice(v2);
        vertices.agregaVertice(v3);
        vertices.agregaVertice(v4);
        vertices.agregaVertice(v5);
        vertices.agregaVertice(v6);
        vertices.agregaVertice(v7);
        vertices.agregaVertice(v8);
        vertices.agregaVertice(v9);
        vertices.agregaVertice(v10);
        vertices.agregaVertice(v11);
        vertices.agregaVertice(v12);
        vertices.agregaVertice(v13);
        vertices.agregaVertice(v14);
        vertices.agregaVertice(v15);
        
        //Navojoa a obregon
        Arista a1 = new Arista(v1, v2, 70, 80);
        Arista a2 = new Arista(v2, v1, 70, 80);
        //Obregón a empalme
        Arista a3 = new Arista(v2, v3, 110, 70);
        Arista a4 = new Arista(v3, v2, 110, 70);
        //Empalme a guaymas
        Arista a5 = new Arista(v3, v4, 13, 0);
        Arista a6 = new Arista(v4, v3, 13, 0);
        //Guaymas a sancarlos
        Arista a7 = new Arista(v4, v5, 20, 0);
        Arista a8 = new Arista(v5, v4, 20, 0);
        //Empalme a Hermosillo
        Arista a9 = new Arista(v3, v6, 139, 85);
        Arista a10 = new Arista(v6, v3, 139, 85);
        //Guaymas a Hermosillo
        Arista a11 = new Arista(v4, v6, 135, 75);
        Arista a12 = new Arista(v6, v4, 135, 75);
        //Hermosillo a ures
        Arista a13 = new Arista(v6, v7, 77, 0);
        Arista a14 = new Arista(v7, v6, 77, 0);
        //Ures a cananea
        Arista a15 = new Arista(v7, v10, 248, 0);
        Arista a16 = new Arista(v10, v7, 248, 0);
        //Hermosillo a santa Ana
        Arista a17 = new Arista(v6, v8, 171, 93);
        Arista a18 = new Arista(v8, v6, 171, 93);
        //Santa Ana a magdalena
        Arista a19 = new Arista(v8, v9, 17, 0);
        Arista a20 = new Arista(v9, v8, 17, 0);
        //Magdalena a cananea
        Arista a21 = new Arista(v9, v10, 103, 0);
        Arista a22 = new Arista(v10, v9, 103, 0);
        //Hermosillo a bahía kino
        Arista a23 = new Arista(v6, v11, 108, 50);
        Arista a24 = new Arista(v11, v6, 108, 50);
        //Bahía kino a caborca
        Arista a25 = new Arista(v11, v12, 380, 208);
        Arista a26 = new Arista(v12, v11, 380, 208);
        //Santa ana a caborca
        Arista a27 = new Arista(v8, v12, 105, 115);
        Arista a28 = new Arista(v12, v8, 105, 115);
        //Caborca a sonoyta
        Arista a29 = new Arista(v12, v14, 150, 0);
        Arista a30 = new Arista(v14, v12, 150, 0);
        //Caborca a puerto peñasco
        Arista a31 = new Arista(v12, v13, 175, 0);
        Arista a32 = new Arista(v13, v12, 175, 0);
        //Puerto peñasco a sonoyta
        Arista a33 = new Arista(v13, v14, 149, 0);
        Arista a34 = new Arista(v14, v13, 149, 0);
        //Sonoyta a san luis
        Arista a35 = new Arista(v14, v15, 202, 0);
        Arista a36 = new Arista(v15, v14, 202, 0);

        aristas.registrarColindancia(a1);
        aristas.registrarColindancia(a2);
        aristas.registrarColindancia(a3);
        aristas.registrarColindancia(a4);
        aristas.registrarColindancia(a5);
        aristas.registrarColindancia(a6);
        aristas.registrarColindancia(a7);
        aristas.registrarColindancia(a8);
        aristas.registrarColindancia(a9);
        aristas.registrarColindancia(a10);
        aristas.registrarColindancia(a11);
        aristas.registrarColindancia(a12);
        aristas.registrarColindancia(a13);
        aristas.registrarColindancia(a14);
        aristas.registrarColindancia(a15);
        aristas.registrarColindancia(a16);
        aristas.registrarColindancia(a17);
        aristas.registrarColindancia(a18);
        aristas.registrarColindancia(a19);
        aristas.registrarColindancia(a20);
        aristas.registrarColindancia(a21);
        aristas.registrarColindancia(a22);
        aristas.registrarColindancia(a23);
        aristas.registrarColindancia(a24);
        aristas.registrarColindancia(a25);
        aristas.registrarColindancia(a26);
        aristas.registrarColindancia(a27);
        aristas.registrarColindancia(a28);
        aristas.registrarColindancia(a29);
        aristas.registrarColindancia(a30);
        aristas.registrarColindancia(a31);
        aristas.registrarColindancia(a32);
        aristas.registrarColindancia(a33);
        aristas.registrarColindancia(a34);
        aristas.registrarColindancia(a35);
        aristas.registrarColindancia(a36);

        do {
            System.out.println("");
            System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
            System.out.println("✮ 1. Agregar una ciudad                                                   ✮");                                                  
            System.out.println("✮ 2. Registrar una colindancia entre dos ciudades                         ✮");
            System.out.println("✮ 3. Registrar distancia y costo de peaje entre dos ciudades colindantes  ✮");
            System.out.println("✮ 4. Modificar distancia y costo de peaje entre dos ciudades colindantes  ✮");
            System.out.println("✮ 5. Consultar ruta más corta entre dos ciudades                          ✮");
            System.out.println("✮ 6. Listar las ciudades registradas y sus colindancias                   ✮");
            System.out.println("✮ 7. Eliminar colindancia                                                 ✮");
            System.out.println("✮ 8. Eliminar una ciudad del mapa                                         ✮");
            System.out.println("✮ 9. Salir                                                                ✮");
            System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
            opcion = tec.nextInt();
            switch (opcion) {
                case 1://Agregar una ciudad
                    System.out.println("Introduzca el nombre de la ciudad a registrar: ");
                    String ciudad = tec.next();
                    Vertice vrt = new Vertice(ciudad);
                    vertices.agregaVertice(vrt);
                    break;
                case 2: //Agregar una colindancia entre dos ciudades
                    System.out.println("Introduzca la primera ciudad colindante: ");
                    String ciudad1 = tec.next();
                    Vertice vrt1 = new Vertice(ciudad1);
                    System.out.println("Introduzca la segunda ciudad colindante: ");
                    String ciudad2 = tec.next();
                    Vertice vrt2 = new Vertice(ciudad2);
                    aristas.registrarColindancia(new Arista(vrt1, vrt2));
                    aristas.registrarColindancia(new Arista(vrt2, vrt1));
                    break;
                case 3: //Registrar los datos de una colindancia entre dos ciudades
                    System.out.println("Introduzca la primera ciudad colindante: ");
                    String col1 = tec.next();
                    Vertice vrtcol1 = new Vertice(col1);
                    vertices.obtenVertice(vrtcol1);
                    System.out.println("Introduzca la segunda ciudad colindante: ");
                    String col2 = tec.next();
                    Vertice vrtcol2 = new Vertice(col2);
                    Arista a = null;
                    a = aristas.obtenColindancia(new Arista(vrtcol1, vrtcol2));
                    if (a != null) {
                        System.out.println("Introduzca la distianca(Km): ");
                        int km = tec.nextInt();
                        System.out.println("Introduzca el costo de peaje: ");
                        int pesos = tec.nextInt();
                        a.setKm(km);
                        a.setPrecio(pesos);
                    } else {
                        System.out.println("Colindancia inexistente");
                    }
                    break;
                case 4: //Modifica la distancia y costo de peaje entre dos ciudades colindantes
                    System.out.println("Introduzca la primera ciudad colindante: ");
                    String modif_col = tec.next();
                    Vertice modif_vrt = new Vertice(modif_col);
                    vertices.obtenVertice(modif_vrt);
                    System.out.println("Introduzca la segunda ciudad colindante: ");
                    String modif_col2 = tec.next();
                    Vertice modif_vrt2 = new Vertice(modif_col2);
                    Arista b = null;
                    b = aristas.obtenColindancia(new Arista(modif_vrt, modif_vrt2));
                    if (b != null) {
                        System.out.println("Introduzca la nueva distianca(Km): ");
                        int km = tec.nextInt();
                        System.out.println("Introduzca el nuevo costo de peaje: ");
                        int pesos = tec.nextInt();
                        b.setKm(km);
                        b.setPrecio(pesos);
                    } else {
                        System.out.println("Colindancia inexistente.");
                    }
                    break;
                case 5: // Consulta la ruta más corta entre dos ciudades
                    System.out.println("Introduzca el numero de la primera ciudad origen");
                    int origen = tec.nextInt();
                    System.out.println("Introduzca el numero de la segunda ciudad destino");
                    int destino = tec.nextInt();
                    int numVertices = vertices.listaVertices().size();
                    int[][] arreglo = aristas.arregloColindancias(numVertices);
                    String[] nombres = vertices.arregloNombres();
                    Dijkstra camino = new Dijkstra(arreglo, origen, nombres);
                    camino.caminoMinimos();
                    camino.recuperaCamino(destino);
                    break;
                case 6: //Lista las ciudades registradas y sus colindancias
                    System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
                    System.out.println("Lista de ciudades:");
                    vertices.imprimeVetices();
                    System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
                    System.out.println("Lista de colindancias:");
                    aristas.imprimeColindancias();
                    break;
                case 7: //Elimina la colindancia entre dos ciudades
                    System.out.println("Introduzca la primera ciudad colindante: ");
                    String elim_col = tec.next();
                    Vertice elim_vrt = new Vertice(elim_col);
                    vertices.obtenVertice(elim_vrt);
                    System.out.println("Introduzca la segunda ciudad colindante: ");
                    String elim_col2 = tec.next();
                    Vertice elim_vrt2 = new Vertice(elim_col2);
                    vertices.obtenVertice(elim_vrt2);
                    Arista eliminar = new Arista(elim_vrt, elim_vrt2);
                    aristas.eliminarColindancia(eliminar);
                    break;
                case 8: //Elimina una ciudad del mapa
                    System.out.println("Introduzca la ciudad a eliminar: ");
                    String elim_ciudad = tec.next();
                    Vertice ciudad_elim = new Vertice(elim_ciudad);
                    vertices.eliminarVertice(ciudad_elim);
                    break;
                case 9:
                    System.exit(0);
                    break;
                case 10: //ruta barata
                    System.out.println("Añada el numero de la primera ciudad");
                    origen = tec.nextInt();
                    System.out.println("Añada el numero de la segunda ciudad");
                    destino = tec.nextInt();
                    numVertices = vertices.listaVertices().size();
                    arreglo = aristas.arregloPrecios(numVertices);
                    nombres = vertices.arregloNombres();
                    rutaBarata pre = new rutaBarata(arreglo, origen, nombres);
                    pre.caminoMinimos();
                    pre.recuperaCamino(destino);          
                    break;
            }
        } while (opcion != 11);

    }

}
