public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int i = 3;
        int j = 7;
        float   k =127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        //&& o andperson: si la primera condicion es falsa, toda la operacion es falsa, pero si es verdadera, leera la siguiente condicion
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);
        
        //|| u or: si al menos una de todas las condiciones es verdadera, toda la operacion es verdadera
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);
        
        //tambien podemos convinar el && y el ||
        boolean b3 = i == j && k < l || m == false;
        System.out.println("b3 = " + b3);

    }
}
