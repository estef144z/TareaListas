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
        
          Node nodoEncontrado = lista.BuscarNodoPorValor("A");
           System.out.println("Nodo encontrado: " + nodoEncontrado.name);
        
        // Insertar un nuevo nodo después de un nodo específico
        String nuevoValor = "E";
        String nodoAntes = "D";
        if (lista.InsertarDespuesDeNodo(nodoAntes, nuevoValor)) {
            System.out.println("Nuevo nodo insertado después de " + nodoAntes + ":");
            lista.imprimir();
        } else {
            System.out.println("No se pudo insertar. Nodo antes de " + nodoAntes + " no encontrado.");
        }

        // Intercambiar dos nodos
        String nodo1 = "A";
        String nodo2 = "C";
        if (lista.IntercambiarNodos(nodo1, nodo2)) {
            System.out.println("Nodos intercambiados:");
            lista.imprimir();
        } else {
            System.out.println("No se pudo intercambiar. Al menos uno de los nodos no encontrado.");
        }
            
           
    }
}