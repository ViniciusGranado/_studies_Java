package exercise02;

import java.util.Scanner;

public class Exercise02 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    Curso curso = new Curso();
    Teacher professor = new Teacher();

    System.out.println("---------------------------");
    System.out.println("     CADASTRO DE CURSO     ");
    System.out.println("---------------------------\n");

    System.out.print("Digite o nome do curso: ");
    curso.setName(input.nextLine());
    System.out.print("Digite o horário do curso: ");
    curso.setTime(input.nextLine());

    System.out.println("\n---------------------------");
    System.out.println("     DADOS DO PROFESSOR    ");
    System.out.println("---------------------------\n");

    System.out.print("Digite o nome do professor: ");
    professor.setName(input.nextLine());

    System.out.print("Digite o departamento do professor: ");
    professor.setDepartment(input.nextLine());

    System.out.print("Digite o e-mail do professor: ");
    professor.setEmail(input.nextLine());

    System.out.println("---------------------------");
    System.out.println("      DADOS DOS ALUNOS     ");
    System.out.println("---------------------------\n");

    Student[] estudantes = new Student[5];

    for (int i = 0; i < estudantes.length; i++) {
      Student estudante = new Student();

      if (i != 0) {
        input.nextLine();
      }

      System.out.println("Aluno " + (i + 1) + ": ");

      System.out.print("Digite o nome do aluno: ");
      estudante.setName(input.nextLine());

      System.out.print("Digite o RA do aluno: ");
      estudante.setId(input.nextInt());

      int[] grades = new int[4];

      for (int j = 0; j < grades.length; j++) {
        System.out.print("Digite a nota " + (j + 1) + " do aluno: ");
        grades[j] = (input.nextInt());
      }

      System.out.println();

      estudante.setGrades(grades);

      estudantes[i] = estudante;
    }

    curso.setStudents(estudantes);
    curso.setTeacher(professor);

    curso.getCourseInfo();

    input.close();
  }

}
