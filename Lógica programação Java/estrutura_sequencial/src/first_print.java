import java.util.Locale;
import java.util.Scanner;


public class first_print {
    public static void main(String[] args) {
        System.out.print("Hello Word");
        System.out.println("Olá Mundo");

        int y = 32;
        System.out.println(y);

        double x = 10.6352;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("O valor é: %.2f Metros\n", x);


        String nome = "Gustavo";
        int idade = 23;
        double renda = 1.100;

        System.out.printf("%s tem %d anos e ganha R$%.3f%n", nome, idade, renda);

        // Exercicio
        String product1= "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("\n \n");

        System.out.println("Products:");
        System.out.printf("%s, which price is R$%.2f%n", product1, price1);
        System.out.printf("%s, which price is R$%.2f%n", product2, price2);

        System.out.println("\n");

        System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);

        System.out.println("\n");

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);

        System.out.println("\n");

        // Atribuição

        // exemplo 01
        int a;
        double z;

        a = 5;
        z = 2 * a;

        System.out.println(z);

        // exemplo 02
        double b , B, h, area;

        b = 6.0;
        B = 8.5;
        h = 5.3;

        area = (b + B) / 2.0 * h;
        System.out.printf("%.2f%n", area);

        // exemplo 03
        int e, f;
        double valor;

        e = 5;
        f = 2;

        valor = (double) e / f;
        System.out.println(valor);

        // exemplo 04
        double g;
        int i;

        g = 5.0;
        i = (int) g; // EXEMPLO CASTING
        System.out.println(i);


        // Entrada de dados

        Scanner sc = new Scanner(System.in);

        String ab = sc.next();
        System.out.printf("Você digitou a palavra: %s%n", ab);

        int bc = sc.nextInt();
        System.out.printf("Você digitou o número: %d%n", bc);

        double cd = sc.nextDouble();
        System.out.printf("O número flutuante é: %.2f%n", cd);

        char de = sc.next().charAt(0);
        System.out.println(de);

        String aa;
        int bb;
        double cc;

        aa = sc.next();
        bb = sc.nextInt();
        cc = sc.nextDouble();

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);



        sc.close();












    }
}
