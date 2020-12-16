import java.util.Scanner;

public class Exercise22 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("----------------");
		System.out.println("  SUPERMERCADO  ");
		System.out.println("----------------\n");

		System.out.print("Quantos Kgs de morango deseja comprar? ");
		double strawberry = input.nextDouble();

		System.out.print("Quantos Kgs de maçã deseja comprar? ");
		double apple = input.nextDouble();

		double strawberryPrice;
		double applePrice;

		if (strawberry <= 5) {
			strawberryPrice = 2.50;
		} else {
			strawberryPrice = 2.20;
		};

		if (apple <= 5) {
			applePrice = 1.80;
		} else {
			applePrice = 1.50;
		};

		double partialPrice = (strawberry * strawberryPrice) + (apple * applePrice);
		double finalPrice;

		if ((partialPrice > 25) || (strawberry + apple > 8)) {
			finalPrice = (partialPrice) - (partialPrice * 10 / 100);
		} else {
			finalPrice = partialPrice;
		}

		System.out.println("\nO valor final da compra será R$" + finalPrice);
	}
}