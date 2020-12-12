import java.util.Scanner;

public class Exercise13 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um número referente à um dia da semana: [1-7] ");
    int dayNumber = input.nextInt();

    switch (dayNumber) {
      case 1:
        System.out.println("\nDomingo.");
        break;
      case 2:
        System.out.println("\nSegunda.");
        break;
      case 3:
        System.out.println("\nTerça");
        break;
      case 4:
        System.out.println("\nQuarta");
        break;
      case 5:
        System.out.println("\nQuinta");
        break;
      case 6:
        System.out.println("\nSexta");
        break;
      case 7:
        System.out.println("\nSábado");
        break;
      default:
        System.out.println("\nValor inválido.");
        break;
    }
  }
}
