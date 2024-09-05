package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.next();

        System.out.println("Digite a nota do primeiro trimestre do aluno(MAX:30.00)");
        student.noteOne = sc.nextDouble();

        System.out.println("Digite a nota do segundo trimestre do aluno(MAX:35.00)");
        student.noteTwo = sc.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre do aluno(MAX:35.00)");
        student.noteThree = sc.nextDouble();

        double finalGrade= student.finalGrade();

        if(finalGrade >= 60){
            System.out.printf("Final Grade: %.2f%n", finalGrade);
            System.out.println("PASS");
        } else{
            System.out.printf("Final Grade: %.2f%n", finalGrade);
            System.out.println("FALID");
            double missing = student.missing();
            System.out.printf("MISSING: %.2f%n", missing);
        }

    }
}
