import java.util.Scanner;

public class Exercise19 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("---------------");
    System.out.println("  CALCULADORA  ");
    System.out.println("---------------\n");

    System.out.print("Digite o primeiro número: ");
    double number1 = input.nextDouble();

    System.out.print("Digite o primeiro número: ");
    double number2 = input.nextDouble();

    System.out.println("\nSelecione a operação que deseja realizar:");
    System.out.println("[1] Adição");
    System.out.println("[2] Subtração");
    System.out.println("[3] Divisão");
    System.out.println("[4] Multiplicação");
    System.out.print("Digite a sua opção: ");

    int userOption = input.nextInt();

    boolean operationIsValid = true;

    double result = 0;

    switch(userOption) {
      case 1:
        result = number1 + number2;
        break;
      case 2:
        result = number1 - number2;
        break;
      case 3:
        result = number1 / number2;
        break;
      case 4:
        result = number1 * number2;
        break;
      default:
        System.out.println("\nOpção inválida.");
        operationIsValid = false;
        break;
    };

    if (operationIsValid) {
      String numberOddOrEven = result % 2 == 0 ? "par" : "ímpar";
      String numberNegativOrPositive;
  
      if (result > 0) {
        numberNegativOrPositive = "positivo";
      } else if (result < 0) {
        numberNegativOrPositive = "negativo";
      } else {
        numberNegativOrPositive = "neutro";
      };
  
      System.out.println("\nO resultado da operação é " + result);
      System.out.println("O número " + result + " é " + numberOddOrEven);
      System.out.println("O número " + result + " é " + numberNegativOrPositive);
    }
  }
}
