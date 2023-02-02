public class OperadoresPresedencia {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 6;
        int numero3 = 9;

        double promedio = (numero1+numero2+numero3) /3d;
        System.out.println("promedio = " + promedio);

        promedio = (numero1+numero2+numero3) /3 * 10;
        System.out.println("promedio = " + promedio);
    }
}
