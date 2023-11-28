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

    // Inserta un nuevo nodo con un valor específico entre dos nodos existentes
    public boolean InsertaEntreNodos(String nombre, String buscado) {
        Nodo temp = new Nodo();
        temp.name = nombre;
        Nodo temp2 = this.top;

        while ((temp2 != null) && temp2.name.equals(buscado) == false) {
            temp2 = temp2.next;
        }

        if (temp2 != null) { // Nodo buscado se encontró
            temp.next = temp2.next;
            temp2.next = temp;
            temp = null;
            temp2 = null;
            return true;
        } else
            return false;
    }

    // Imprime los valores de los nodos en la lista
    public void imprimir() {
        for (Nodo temp = this.top; temp != null; temp = temp.next) {
            System.out.print("[ " + temp.name + " ] -> ");
        }

        System.out.print("[X]\n");
    }

    // Devuelve una representación en cadena de la lista
    public String toString() {
        String cadAux = "";
        for (Nodo temp = this.top; temp != null; temp = temp.next) {
            cadAux += "[ " + temp.name + " ] -> ";
        }

        cadAux += "[X]\n";

        return cadAux;
    }

    // Métodos de borrado

    // Borra el primer nodo de la lista
    public void BorrarPrimerNodo() {
        this.top = this.top.next;
    }

    // Borra cualquier nodo que no sea el primero
    public boolean BorrarCualquierNodo(String buscado) {
        Nodo temp = this.top;

        while ((temp != null) && temp.name.equals(buscado) == false) {
            temp = temp.next;
        }

        if (temp != null) { 
            temp.next = temp.next.next;
            temp = null;
            return true;
        } else
            return false;
    }

    public Nodo BuscarNodoPorValor(String valorBuscado) {
        Nodo temp = this.top;

        while (temp != null && !temp.name.equals(valorBuscado)) {
            temp = temp.next;
        }

        return temp;
    }

    // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public boolean InsertarDespuesDeNodo(String valorBuscado, String nuevoValor) {
        Nodo temp = BuscarNodoPorValor(valorBuscado);

        if (temp != null) {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.name = nuevoValor;
            nuevoNodo.next = temp.next;
            temp.next = nuevoNodo;
            return true;
        } else {
            return false; 
        }
    }
 // Intercambiar un nodo por otro buscado
 public boolean InterCambiarNodos(String valorNodo1, String valorNodo2) {
    Nodo nodo1Prev = null;
    Nodo nodo1 = this.top;

    while (nodo1 != null && !nodo1.name.equals(valorNodo1)) {
        nodo1Prev = nodo1;
        nodo1 = nodo1.next;
    }

    Nodo nodo2Prev = null;
    Nodo nodo2 = this.top;

    while (nodo2 != null && !nodo2.name.equals(valorNodo2)) {
        nodo2Prev = nodo2;
        nodo2 = nodo2.next;
    }

    if (nodo1 != null && nodo2 != null) {
        if (nodo1Prev != null) {
            nodo1Prev.next = nodo2;
        } else {
            this.top = nodo2;
        }

        if (nodo2Prev != null) {
            nodo2Prev.next = nodo1;
        } else {
            this.top = nodo1;
        }

        Nodo temp = nodo1.next;
        nodo1.next = nodo2.next;
        nodo2.next = temp;

        return true;
    } else {
        return false; // Al menos uno de los nodos no fue encontrado
    }
}
}