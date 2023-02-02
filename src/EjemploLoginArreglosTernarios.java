import java.util.Scanner;

public class EjemploLoginArreglosTernarios {
    public static void main(String[] args) {

        //creacion de los arreglos primera forma
        String[] userName = new String[2];
        String[] password = new String[2];

        //usuarios registrados
        userName[0] = "YorchMoreno";
        password[0] = "120322";

        userName[1] = "GinaDiaz";
        password[1] = "123456";

        //segunda forma
        /*String[] userName = {"GinaDiaz, YorchMoreno"};
        String[] password = {"123456", "120322"};*/

        //recolector de datos por teclado
        Scanner scanner = new Scanner (System.in);

        //pedir datos de usuario
        System.out.print("UserName: ");
        String usuario = scanner.next();

        System.out.print("PassWord: ");
        String pass = scanner.next();

        boolean esAutenticado = false;
        //Validar la informacion
        for (int i = 0; i < userName.length; i++) {
            esAutenticado = (userName[i].equals(usuario) && password[i].equals(pass))? true: esAutenticado;
            /*if (userName[i].equals(usuario) && password[i].equals(pass)) {
                System.out.println("WELCOME ".concat(usuario));
                break;
            } else {
                System.out.println("ERROR OF USER OR PASSWORD");
            }*/

            String mensaje = esAutenticado ? "WELCOME ".concat(usuario): "ERROR OF USER";
            System.out.println("mensaje = " + mensaje);
        }
    }
}