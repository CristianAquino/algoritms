public class Pila implements IPila{
    private Nodo pila;
    private int tamanio;
    private String lista;

    public Pila(){
        this.pila = null;
        this.tamanio = 0;
        this.lista = "";
    }

    public boolean PilaVacia(){
        return pila == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.next = pila;
        pila = nuevo_nodo;
        tamanio++;
    }

    @Override
    public int EliminarNodo() {
        int aux = pila.data;
        pila = pila.next;
        tamanio--;
        return aux;
    }

    @Override
    public int MostrarUltimoValor() {
        return pila.data;
    }

    @Override
    public void VaciarPila() {
        while(!PilaVacia()){
            EliminarNodo();
        }
    }

    @Override
    public void MostrarValores() {
         Nodo recorrido = pila;
         while (recorrido != null){
             lista += recorrido.data+"<-";
             recorrido = recorrido.next;
         }
        System.out.println(lista);
         lista = "";
    }
}
