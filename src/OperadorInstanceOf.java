public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Buenas tardes";
        Integer entero = 1235;

        boolean b1 = texto instanceof String;
        System.out.println("texto de tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto de tipo Object = " + b1);

        b1 = entero instanceof Integer;
        System.out.println("nuero de tipo Integer = " + b1);

        b1 = entero instanceof Number;
        System.out.println("nuero de tipo Number = " + b1);

        Double numero1 = 12.356;
        b1 = numero1 instanceof Number;
        System.out.println("decimal de tipo Number = " + b1);

    }
}
