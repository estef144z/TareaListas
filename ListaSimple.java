public class ListaSimple {
    Nodo top;

    // Métodos para los casos de inserción de nodos

    // Inserta un nuevo nodo como el primer nodo de la lista
    public boolean InsertaPrimerNodo(String dato) {
        if (top == null) { // La lista está vacía
            top = new Nodo();
            top.name = dato;
            top.next = null;
            return true;
        } else {
            return false;
        }
    }

    // Inserta un nuevo nodo antes del primer nodo existente
    public void InsertaAntesPrimerNodo(String nombre) {
        Nodo temp;
        temp = new Nodo();
        temp.name = nombre;
        temp.next = this.top;
        this.top = temp;
        temp = null;
    }

    // Inserta un nuevo nodo al final de la lista
    public void InsertaAlFinal(String nombre) {
        Nodo temp = new Nodo();
        temp.name = nombre;
        temp.next = null;
        Nodo temp2 = this.top;

        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = temp;
        temp = null;
        temp2 = null;
    }

    // Buscar un nodo por el valor de su campo clave y devolver una referencia
    public Nodo BuscarNodoPorValor(String valor) {
        Nodo temp = top;
        while (temp != null) {
            if (temp.name.equals(valor)) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // No se encontró el nodo con el valor especificado
    }

    // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public boolean InsertarDespuesDeNodo(String valorBuscado, String nuevoValor) {
        Nodo nodoBuscado = BuscarNodoPorValor(valorBuscado);

        if (nodoBuscado != null) {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.name = nuevoValor;
            nuevoNodo.next = nodoBuscado.next;
            nodoBuscado.next = nuevoNodo;
            return true; // Inserción exitosa
        } else {
            return false; // No se encontró el nodo con el valor especificado
        }
    }

    // Intercambiar un nodo por otro buscado
    public void InterCambiarNodos(String valorNodo1, String valorNodo2) {
        Nodo nodo1 = BuscarNodoPorValor(valorNodo1);
        Nodo nodo2 = BuscarNodoPorValor(valorNodo2);

        if (nodo1 != null && nodo2 != null) {
            // Intercambiar los valores de los nodos
            String temp = nodo1.name;
            nodo1.name = nodo2.name;
            nodo2.name = temp;
        }
        // No hacer nada si alguno de los nodos no se encuentra
    }
    public void Imprimir() {
        Nodo temp = top;
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println(); // Salto de línea al final
    }
}
      
    
