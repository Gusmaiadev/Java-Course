package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ExemploUm {



    public static void main(String[] args) {

        Locale.setDefault(Locale.US) ;
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor PI: %.2f%n", Calculator.PI);

        sc.close();
    }



}
