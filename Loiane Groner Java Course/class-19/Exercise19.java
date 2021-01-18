import java.util.Scanner;

public class Exercise19 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    float[] notas1 = new float[10];
    float[] notas2 = new float[notas1.length];
    float[] result = new float[notas1.length];

    for (int i = 0; i < notas1.length; i++) {
      System.out.println("ALUNO " + (i + 1) + "\n");

      System.out.print("Digite a nota 1 do aluno " + (i + 1) + ": ");
      notas1[i] = input.nextFloat();
      System.out.print("Digite a nota 2 do aluno " + (i + 1) + ": ");
      notas2[i] = input.nextFloat();

      System.out.println("-----------------------\n");

      result[i] = (notas1[i] + notas2[i]) / 2;
    };

    System.out.println("-----------------------");
    System.out.println("       RESULTADO");
    System.out.println("-----------------------\n");
    
    for (int i = 0; i < result.length; i++) {
      System.out.println("ALUNO " + (i + 1) + "\n");
      
      System.out.println("Média: " + result[i]);
      System.out.println("Situação: " + (result[i] >= 7 ? "Aprovado" : "Reprovado"));
      System.out.println("-----------------------\n");
    }

    input.close();
  }
}
