import java.util.Scanner;

public class Exercise23 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("-------------------------");
		System.out.println("  HIPERMERCADO TABAJARA  ");
		System.out.println("-------------------------\n");

		System.out.println("Selecione o tipo de carne que desja comprar:");
		System.out.println("[1] Filé Duplo");
		System.out.println("[2] Alcatra");
		System.out.println("[3] Picanha");
		System.out.print("Digite o número da sua opção: ");
		
		int userOption = input.nextInt();
		
		if (userOption >=1 && userOption <= 3) {
			System.out.print("Quantos Kgs deseja comprar? ");
			double meatKg = input.nextDouble();
			
			double meatPrice = 0;
			double partialPrice = 0;
			double finalPrice = 0;
			double totalDiscount = 0;

			String userCardAnswer = "";
			String meatName = "";

			boolean isPayingWithCard = true;

			if (userOption == 1) {
				meatName = "Filé Duplo";
				if (meatKg <= 5) {
					meatPrice = 4.90;
				} else {
					meatPrice = 5.80;
				};
			} else if (userOption == 2) {
				meatName = "Alcatra";
				if (meatKg <= 5) {
					meatPrice = 5.90;
				} else {
					meatPrice = 6.80;
				};
			} else if (userOption == 3) {
				meatName = "Picanha";
				if (meatKg <= 5) {
					meatPrice = 6.90;
				} else {
					meatPrice = 7.80;
				};
			};

			partialPrice = meatKg * meatPrice;

			System.out.print("Deseja pagar com o cartão Tabajara? [S/N] ");
			userCardAnswer = input.next();

			if (userCardAnswer.equalsIgnoreCase("S")) {
				isPayingWithCard = true;
				totalDiscount = partialPrice * 5 / 100;
				finalPrice = partialPrice - totalDiscount;
			} else if (userCardAnswer.equalsIgnoreCase("N")) {
				isPayingWithCard = false;
				finalPrice = partialPrice;
			} else {
				System.out.print("\nOpção inválida.");
				System.exit(0);
			};

			System.out.println("\nNOTA FISCAL");
			System.out.println("Produto: " + meatName);
			System.out.println("Quantidade: " + meatKg + "Kg");
			System.out.println("Pagamento com cartão Tabajara: " + (isPayingWithCard ? "SIM" : "NÃO"));

			System.out.println("\nValor total: R$" + partialPrice);
			System.out.println("Total de descontos: R$" + totalDiscount);
			System.out.println("Valor final: R$" + finalPrice);

		} else {
			System.out.print("\nOpção inválida.");
		}
	}
}