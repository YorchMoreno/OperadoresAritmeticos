public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 5;
        float h = 127e-7f;
        boolean m = false;

        //igual a
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        //cambia valor
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        //distinto a
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        //mayor que y menor que
        boolean b4 = i > j;
        System.out.println("b4 = " + b4);
        boolean b5 = i < j;
        System.out.println("b5 = " + b5);


    }
}
