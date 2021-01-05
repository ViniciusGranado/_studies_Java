import java.util.Scanner;

public class Exercise25 {
  public static void main (String[] args) {
    do {
      Scanner scanner = new Scanner(System.in);
  
      System.out.println("-------------------------");
      System.out.println("  LOJA DE CONVENIÊNCIAS  ");
      System.out.println("-------------------------\n");
  
      double totalValue = 0;
      double productValue;
      
      int count = 1;
      do {
        System.out.print("Valor do produto " + count + ": R$");
        productValue = scanner.nextDouble();
        totalValue += productValue;
        count++;
      } while (productValue != 0);
  
      System.out.println("Total: R$" + totalValue);
  
      System.out.print("Dinheiro: R$");
      double totalMoney = scanner.nextDouble();
  
      double change = totalMoney - totalValue;
  
      System.out.println("\nTroco: R$" + change);
      System.out.println("...\n");

      char userAnswer;
      boolean isAnswerValid = true;
        do {
          System.out.print("Deseja iniciar uma nova compra? [S/N] ");
          userAnswer = Character.toUpperCase(scanner.next().charAt(0));

          if (userAnswer != 'S' && userAnswer != 'N') {
            System.out.println("Reposta inválida, tente novamente.\n");
            isAnswerValid = false;
          };
        } while (!isAnswerValid);

        if (userAnswer == 'N') {
          break;
        } else {
          System.out.println();
        }
    } while (true);

    System.out.println("\nFinalizando...");
  };
}
