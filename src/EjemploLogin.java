import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {

        //usuarios registrados
        String userName1 = "YorchMoreno";
        String password1 = "120322";

        String userName2 = "GinaDiaz";
        String password2 = "123456";

        //recolector de datos por teclado
        Scanner scanner = new Scanner (System.in);

        //pedir datos de usuario
        System.out.print("UserName: ");
        String usuario = scanner.next();

        System.out.print("PassWord: ");
        String pass = scanner.next();

        if (userName1.equals(usuario) && password1.equals(pass) || userName2.equals(usuario) && password2.equals(pass)){
            System.out.println("WELCOME ".concat(usuario));
        }else{
            System.out.println("ERROR OF USER OR PASWORD");
        }
    }
}
