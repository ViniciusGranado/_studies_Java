package Exercise03;
import java.util.Scanner;

public class Exercise03 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    Student student = new Student();

    // Input
    System.out.println("-------------------------------");
    System.out.println("         SISTEMA ESCOLAR       ");
    System.out.println("-------------------------------\n");
    System.out.print("Digite o nome do aluno: ");
    student.name = input.nextLine();

    System.out.print("Digite o número de matricula do aluno: ");
    student.registrationNumber = input.next();

    System.out.print("Digite o curso do aluno: ");
    student.course = input.next();

    for (int i = 0; i < student.subjects.length; i++) {
      System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
      student.subjects[i] = input.next();
    }

    System.out.println("---------------------------------");

    for (int i = 0; i < student.grades.length; i++) {
      for (int j = 0; j < student.grades[i].length; j++) {
        System.out.print("Digite a nota " + (j + 1) + " da disciplina " + (student.subjects[i]) + ": ");
        student.grades[i][j] = input.nextDouble();
      }
      System.out.println("---------------------------------");
    }

    // Output
    student.showInfo();

    input.close();
  }
}
