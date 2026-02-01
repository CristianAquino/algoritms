public class Nodo {
    public int dato;
    public Nodo siguiente;

    public int getDato() {
        return dato;
    }

    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }
}
