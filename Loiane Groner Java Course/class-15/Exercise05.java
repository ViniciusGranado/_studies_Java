import java.util.Scanner;

public class Exercise05 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-----------------------------------");
    System.out.println("  CALCULADORA DE CONCEITO ESCOLAR  ");
    System.out.println("-----------------------------------\n");

    System.out.print("Digite a primeira nota: ");
    double firstGrade = input.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double secondGrade = input.nextDouble();

    double mean = ((firstGrade + secondGrade) / 2);

    System.out.println("\nA média do aluno foi " + mean);

    if (mean == 10) {
      System.out.print("Conceito: APROVADO COM DISTINÇÃO");
    } else if (mean >= 7) {
      System.out.print("Conceito: APROVADO");
    } else {
      System.out.print("Conceito: REPROVADO");
    };
  }
}
