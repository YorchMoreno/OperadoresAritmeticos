import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        //suma
        int suma = i+j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        //resta
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i * j = " + (i - j));

        //multiplicacion
        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("i * j = " + (i * j));

        //division
        float div = (float)i / (float)j;
        System.out.println("div = " + div);
        System.out.println("i / j = " + (i / j));

        //residuo
        int resto = i % j;
        System.out.println("resto = " + resto);

        //par o impar
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        if (numero % 2 == 0){
            System.out.println("numero par= " + numero);
        }else{
            System.out.println("numero impar= " + numero);
        }
    }
}
