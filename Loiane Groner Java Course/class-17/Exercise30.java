import java.util.Scanner;

public class Exercise30 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("-----------");
    System.out.println("  TABUADA  ");
    System.out.println("-----------\n");

    int userNum;
    int start;
    int end;

    System.out.print("Digite um número inteiro para mostar sua tabuada: ");
    userNum = scanner.nextInt();

    System.out.print("Início da tabuada: ");
    start = scanner.nextInt();

    System.out.print("Fim da tabuada: ");
    end = scanner.nextInt();

    System.out.println("\n-----------------------");
    for (int i = start; i <= end; i++) {
      System.out.println(userNum + " X " + i + " = " + (userNum * i));
    };
    System.out.println("-----------------------");

  }
}
