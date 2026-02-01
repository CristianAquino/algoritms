public class Cola implements ICola{

    private Nodo frente;
    private Nodo fin;

    public Cola(){
        this.frente = null;
        this.fin = null;
    }

    public boolean isColaVacia(Nodo frente){
        return frente==null;
    }

    @Override
    public void encola(int dato) {
        Nodo nuevo_nodo = new Nodo(dato);
        if(this.isColaVacia(frente)){
            frente = nuevo_nodo;
        }else{
            fin.siguiente = nuevo_nodo;
        }
        fin = nuevo_nodo;
    }

    @Override
    public int desencolar() {
        if(!this.isColaVacia(frente)){
            int dato = frente.dato;
            if(frente == fin){
                frente = null;
                fin = null;
            }else{
                frente= frente.siguiente;
            }
            return dato;
        }else{
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public int mostrarAgregado(){
        return fin.getDato();
    }

    @Override
    public void mostarTodo() {
        Nodo aux = frente;
        String cola = "";
        while(aux!=null){
            cola += aux.dato+ "->";
            aux = aux.siguiente;
        }
        if(cola.equals("")){
            System.out.println("No hay datos en la cola");
        }else{
            System.out.println(cola);
        }
    }
}
