package application;

import java.util.Locale;
import java.util.Scanner;

public class ExemploUm {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US) ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor PI: %.2f%n", PI);

        sc.close();
    }

    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3;
    }

}
