public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5; // el operador de asignacion es el igual (=)
        int j = i +4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 4; // i = i +4;
        System.out.println("i = " + i);

        i -= 4; // i = i - 4;
        System.out.println("i = " + i);

        String sqlString = "select * from clientes as c";
        sqlString += "where c.nombre = 'Andres'";
        sqlString += "and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
