import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
        
        String estructuraTernaria = 7 == 5 ? "es igual": "no es igual";
        System.out.println("estructuraTernaria = " + estructuraTernaria);

        //esto es igual que decir:
        if (7 == 5){
            System.out.println("es igual");
        }else{
            System.out.println("no es igual");
        }
        
        //ejemplo dinamico
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la nota de matematicas de 1.0 a 5.0");
        
        double matematicas = scanner.nextDouble();
        System.out.println("ingrese la nota de ciencias de 1.0 a 5.0");
        double ciencias = scanner.nextDouble();
        
        System.out.println("ingrese la nota de sociales de 1.0 a 5.0");
        double sociales = scanner.nextDouble();
        
        double promedio = (matematicas+ciencias+sociales)/3;
        System.out.println("promedio = " + promedio);
        String estado = promedio >= 3.5 ? "APROBADO": "REPROBADO";
        System.out.println("estado = " + estado);
        
    }
}
