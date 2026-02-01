import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op,dato;
        ICola cola = new Cola();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Encolar\n" +
                    "2. Desencolar\n" +
                    "3. Mostrar cola\n"+
                    "0. Salir\n");

            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Ingrese el dato: ");
                    dato = sc.nextInt();
                    cola.encola(dato);
                    System.out.println("se agrego a la cola: "+cola.mostrarAgregado());
                    break;
                case 2:
                    System.out.println("---Desencolando---");
                    System.out.println("se atendio a: "+cola.desencolar());
                    break;
                case 3:
                    System.out.println("---Mostrando la cola---");
                    cola.mostarTodo();
                    break;
                case 0:
                    System.out.println("finalizando programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (op != 0);
    }
}