public class OperadoresIncrementoYDecremento {
    public static void main(String[] args) {
        //preincremento
        int i = 1;
        int h = ++i; // h = i +1;

        System.out.println("i = " + i);
        System.out.println("h = " + h);

        //postincremento
        i = 2;
        h = i++;
        System.out.println("i = " + i);
        System.out.println("h = " + h);

        //predecremento
        i = 3;
        h = --i;
        System.out.println("i = " + i);
        System.out.println("h = " + h);

        //postdecremento
        i = 4;
        h = i--;
        System.out.println("i = " + i);
        System.out.println("h = " + h);
    }
}
