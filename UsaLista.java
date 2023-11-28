public class UsaLista {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de ListaSimple
        ListaSimple lista = new ListaSimple();

        // Insertar algunos nodos para demostrar las operaciones
        lista.InsertaPrimerNodo("D");
        lista.InsertaAntesPrimerNodo("C");
        lista.InsertaAlFinal("B");
        lista.InsertaAlFinal("A");

        // Imprimir la lista antes de realizar las operaciones
        System.out.println("Lista original:");
        lista.imprimir();

        Nodo nodoEncontrado = lista.BuscarNodoPorValor("D");
        System.out.println("Nodo encontrado: " + nodoEncontrado);

        // 2. Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
        lista.InsertarDespuesDeNodo("B", "E");
        System.out.println("\nLista después de insertar nuevo nodo:");
        lista.imprimir();

        // 3. Intercambiar un nodo por otro buscado
        lista.InterCambiarNodos( "C", "A");
        System.out.println("\nLista después de intercambiar nodos:");
        lista.imprimir();


    }
}
