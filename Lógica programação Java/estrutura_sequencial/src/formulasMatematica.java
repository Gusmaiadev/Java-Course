public class formulasMatematica {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        // Calcula raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println("\n");

        // Eleva ao quadrado
        A = Math.pow(x, y);
        B = Math.pow(x ,2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println("\n");

        // Recebe o valor absoluto
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }
}
