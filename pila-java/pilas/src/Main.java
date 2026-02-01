import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int nodo = 0;
        Pila pila = new Pila();
        Scanner sc = new Scanner(System.in);
            do{
                System.out.println("1. Insertar\n" +
                        "2. Eliminar\n" +
                        "3. Vacia?\n" +
                        "4. Ultimo valor\n" +
                        "5. Cantidad de nodos\n" +
                        "6. Limpiar pila\n" +
                        "7. Contendio\n" +
                        "8. Salir\n");

                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("ingrese el valor nuevo\n");
                        nodo = sc.nextInt();
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            System.out.println("se elimino el nodo con valor "+pila.EliminarNodo());
                        }else{
                            System.out.println("pila vacia, no se puede realiar accion");
                        }
                        break;
                    case 3:
                        if(pila.PilaVacia()){
                            System.out.println("pila vacia");
                        }else{
                            System.out.println("pila no esta vacia, tiene "+pila.getTamanio()+" nodos");
                        }
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            System.out.println("ultimo valor: "+pila.MostrarUltimoValor());
                        }else{
                            System.out.println("pila ya esta vacia");
                        }
                        break;
                    case 5:
                        System.out.println("la pila tiene  "+pila.getTamanio()+" nodos");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            System.out.println("pila vacia");
                        }else{
                            System.out.println("pila ya esta vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        System.out.println("cerrando programa");
                        break;
                    default:
                        System.out.println("opcion invalida\n");
                        break;
                }
        }while(opcion!=8);

        sc.close();
    }
}