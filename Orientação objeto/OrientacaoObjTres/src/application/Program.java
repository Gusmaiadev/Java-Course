package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a altura do retangulo: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Digite a largura do retangulo: ");
        rectangle.width = sc.nextDouble();

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
    }
}
