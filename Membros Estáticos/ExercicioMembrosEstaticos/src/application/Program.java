package application;

import util.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de dolares que ira comprar: ");
        int qtdDolar = sc.nextInt();

        double valorTotal = Dolar.valorPagar(qtdDolar);

        System.out.printf("Valor total: R$%.2f%n", valorTotal);
        System.out.println("Valor da taxa: " + Dolar.taxa);
        System.out.printf("Valor do dolar : R$%.2f%n", Dolar.valorDolar);


        sc.close();

    }
}
