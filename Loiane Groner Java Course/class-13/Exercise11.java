import java.util.Scanner;

public class Exercise11 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int num1 = input.nextInt();

    System.out.print("Digite outro número inteiro: ");
    int num2 = input.nextInt();

    System.out.print("Digite um número real: ");
    double num3 = input.nextDouble();

    System.out.println("O produto do dobro do primeiro número com a metade do segundo número é " + ((num1 * 2) * (num2 / 2)));

    System.out.println("A soma do triplo do primeiro número com o terceiro número é " + ((num1 * 3) + num3));

    System.out.println("O terceiro número elevado ao cubo é " + (Math.pow(num3, 3)));
  }
}