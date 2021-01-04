import java.util.Scanner;

public class Exercise21 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

  
    System.out.print("Digite o número de turmas: ");
    double numClasses = scanner.nextInt();

    int numStudents;
    double totalStudents = 0;
    boolean isNumStudentsValid;
    
    for (int i = 0; i < numClasses; i++) {
      do {
        System.out.println();
        isNumStudentsValid = true;
  
        System.out.print("Digite o número de alunos da turma " + (i + 1) + ": ");
        numStudents = scanner.nextInt();
  
        if (numStudents < 1 || numStudents > 40) {
          System.out.println("Número de alunos inválido, tente novamente.");
          isNumStudentsValid = false;
        };
      } while (!isNumStudentsValid);

      totalStudents += numStudents;
    };

    double studentPerClassMean = totalStudents / numClasses;

    System.out.println("\nA média de alunos por turma é " + studentPerClassMean);
  }
}
