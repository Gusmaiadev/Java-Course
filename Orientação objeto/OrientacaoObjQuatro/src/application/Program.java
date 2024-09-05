package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.println("Digite o nome do funcionário: ");
        employee.name = sc.next();

        System.out.println("Digite o salário bruno no mês do funcionário: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Digite o valor da taxa que será descontado: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", $" + String.format("%.2f%n", employee.netSalary()));

        System.out. println("Digite o valor da porcentagem para incremento: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);


        System.out.println("Update data: " + employee.name + ", $" + String.format("%.2f%n", employee.grossSalary));



    }
}
