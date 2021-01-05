import java.util.Scanner;

public class Exercise29 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("------------------------------");
    System.out.println("  ENCONTRANDO NÚMEROS PRIMOS  ");
    System.out.println("------------------------------\n");
    
    System.out.println("Este programa irá mostrar todos os números primos existentes de 1 até o número que você digitar.");
    System.out.print("Digite o número desejado: ");
    int userNumber = scanner.nextInt();
    
    System.out.print("\nOs números primos encontrados foram: ");
    boolean isPrimeNumber;

    for (int i = 2; i <= userNumber; i++) {
      isPrimeNumber = true;

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrimeNumber = false;
          break;
        };
      };

      if (isPrimeNumber) {
        System.out.print(i + " ");
      }
    };
  }
}