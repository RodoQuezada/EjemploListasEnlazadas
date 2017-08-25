
package listaenlazadas;

public class Lista {

    Nodo inicio, fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public boolean listaVacia() {
        return (this.inicio == null);
    }

    public void ingresarInicio(int dato) {
        Nodo nuevo = new Nodo(dato, inicio);
        inicio = nuevo;
        if (fin == null) {
            fin = inicio;
        }
    }

    public void ingresarFinal(int dato) {
        Nodo nuevo = new Nodo(dato, null);
        if (inicio == null) {
            fin = nuevo;
            inicio = fin;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void eliminarInicio() {
        inicio = inicio.siguiente;
    }

    public void eliminarFinal() {
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != fin) {
                aux = aux.siguiente;
            }
            fin = aux;
            fin.siguiente = null;
        }
    }

    public void eliminarNodo(int dato) {
        if (!listaVacia()) {
            if (inicio == fin && inicio.getDato() == dato) {
                inicio = fin = null;
            } else if (inicio.getDato() == dato) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo anterior, aux;
                anterior = inicio;
                aux = inicio.getSiguiente();
                while (aux != null && aux.getDato() != dato) {
                    anterior = anterior.getSiguiente();
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    anterior.setSiguiente(aux.getSiguiente());
                    if (aux == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }

    public void pintar() {
        Nodo recorrer = inicio;
        System.out.println("");
        while (recorrer != null) {
            System.out.print("{" + recorrer.getDato() + "}-->");
            recorrer = recorrer.siguiente;
        }
    }

}
