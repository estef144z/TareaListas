public class UsaLista {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de ListaSimple
        ListaSimple lista = new ListaSimple();

        // Insertar algunos nodos para demostrar las operaciones
        lista.InsertaPrimerNodo("D");
        lista.InsertaAntesPrimerNodo("C");
        lista.InsertaAlFinal("B");
        lista.InsertaAlFinal("A");

     
        // Buscar un nodo por el valor de su campo clave
        Nodo nodoEncontrado = lista.BuscarNodoPorValor("D");
        System.out.println("Nodo encontrado: " + nodoEncontrado);

        // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
        lista.InsertarDespuesDeNodo("B", "E");
        System.out.println("\nLista después de insertar nuevo nodo:");
        lista.Imprimir();

        // Intercambiar un nodo por otro buscado
        lista.InterCambiarNodos("C", "A");
        System.out.println("\nLista después de intercambiar nodos:");
        lista.Imprimir();
    }
}
