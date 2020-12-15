import java.util.Scanner;

public class Exercise21 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("---------------------");
    System.out.println("  POSTO DE GASOLINA  ");
    System.out.println("---------------------\n");

    System.out.println("Qual combustível deseja abastecer: ");
    System.out.println("[1] Alcool");
    System.out.println("[2] Gasolina");
    System.out.print("Digite a sua opção: ");

    int fuelType = input.nextInt();

    int fuelLiters;
    int discount = 0;
    double totalPrice = 0;
    double finalPrice;
    boolean isOptionValid = true;

    if (fuelType == 1) {
      System.out.println("\nAlcool selecionado");

      System.out.print("\nQuantos litros deseja abastecer: ");
      fuelLiters = input.nextInt();

      totalPrice = 1.90 * fuelLiters;

      if (fuelLiters <= 20) {
        discount = 3 * fuelLiters;
      } else {
        discount = 5 * fuelLiters;
      };

    } else if (fuelType == 2) {
      System.out.println("\nGasolina selecionada\n");

      System.out.print("\nQuantos litros deseja abastecer: ");
      fuelLiters = input.nextInt();

      totalPrice = 2.50 * fuelLiters;
      
      if (fuelLiters <= 20) {
        discount = 4 * fuelLiters;
      } else {
        discount = 6 * fuelLiters;
      };
    } else {
      System.out.print("\nOpção inválida.");
      isOptionValid = false;
    };

    if (isOptionValid) {
      finalPrice = totalPrice - (totalPrice * discount / 100);

      System.out.println("\nO valor final será R$" + finalPrice);
    }
  }
}
