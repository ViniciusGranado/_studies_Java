import java.util.Scanner;

public class Exercise14 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite a primeira nota: ");
    double grade1 = input.nextDouble();

    System.out.print("Digite a primeira nota: ");
    double grade2 = input.nextDouble();

    double mean = ((grade1 + grade2) / 2);
  
    char finalGrade;
    if (mean < 4) {
      finalGrade = 'E';
    } else if (mean < 6) {
      finalGrade = 'D';
    } else if (mean < 7.5) {
      finalGrade = 'C';
    } else if (mean < 9) {
      finalGrade = 'B';
    } else {
      finalGrade = 'A';
    };

    System.out.println("\nA média do aluno foi: " + mean);
    System.out.println("O conceito final é: " + finalGrade);

    switch (finalGrade) {
      case 'A':
      case 'B':
      case 'C':
        System.out.println("Aluno APROVADO");
        break;
      case 'D':
      case 'E':
        System.out.println("Aluno REPROVADO");
        break;
      default:
        System.out.println("[ERRO] Conceito inválido.");
        break;
    };
  }
}
