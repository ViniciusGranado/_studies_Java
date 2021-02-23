package exercise03;
import java.util.Scanner;

import exercise03.Student.Student;

public class Exercise03 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    Student student = new Student();

    // Input
    System.out.println("-------------------------------");
    System.out.println("         SISTEMA ESCOLAR       ");
    System.out.println("-------------------------------\n");
    System.out.print("Digite o nome do aluno: ");
    student.setName(input.nextLine());

    System.out.print("Digite o número de matricula do aluno: ");
    student.setRegistrationNumber(input.nextLine());

    System.out.print("Digite o curso do aluno: ");
    student.setCourse(input.nextLine());

    for (int i = 0; i < student.getSubjects().length; i++) {
      System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
      student.getSubjects()[i] = input.nextLine();
    }

    System.out.println("---------------------------------");

    for (int i = 0; i < student.getGrades().length; i++) {
      for (int j = 0; j < student.getGrades()[i].length; j++) {
        System.out.print("Digite a nota " + (j + 1) + " da disciplina " + (student.getSubjects()[i]) + ": ");
        student.getGrades()[i][j] = input.nextDouble();
      }
      System.out.println("---------------------------------");
    }

    // Output
    student.showInfo();

    input.close();
  }
}
