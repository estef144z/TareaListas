public class UsarListaDoble {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();
        // Insertar nodos en la lista
        lista.insertaPrimerNodo("A");
        lista.insertaAlFinal("B");
        lista.insertaAlFinal("C");
        lista.insertaAlFinal("D");

        System.out.println("Lista inicial:");
        lista.imprimir();

        // Buscar un nodo por el valor de su campo clave y devolver una referencia
        Node nodoEncontrado = lista.BuscarNodoPorValor("B");
        System.out.println("Nodo encontrado: " + nodoEncontrado.name);

        // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
        lista.InsertarDespuesDeNodo("B", "E");
        System.out.println("\nLista después de insertar nuevo nodo:");
        lista.imprimir();

        // Intercambiar un nodo por otro buscado
        lista.InterCambiarNodos("C", "A");
        System.out.println("\nLista después de intercambiar nodos:");
        lista.imprimir();

    }
}
