package application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //  Para usar . ao invés de , nos números flutuantes
        Scanner sc = new Scanner(System.in); //  Scanner para entrada de dados

        // instanciando a classe
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the meansures of tringle X: ");
        x.a= sc.nextDouble(); // nextDouble faz parte da função Java para entrada de dados usando Scanner
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the mensures of tringle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

       // Usando o Metodo criado na classe Trinagle
       double areaX = x.area();
       double areaY = y.area();


        System.out.printf("Area of tringle X: %.4f%n", areaX);
        System.out.printf("Area of tringle Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        } else{
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
