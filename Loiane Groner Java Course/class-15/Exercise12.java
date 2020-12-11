import java.util.Scanner;

public class Exercise12 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int syndicateTax = 3;
    int fgtsTax = 11; 
    int incomeTax;
    double grossSalary, netSalary, syndicateShare, fgtsShare, incomeShare, totalDiscounts;

    System.out.println("---------------------------------");
    System.out.println("  CÁLCULO DE FOLHA DE PAGAMENTO  ");
    System.out.println("---------------------------------\n");

    System.out.print("Digite o valor/hora: R$");
    double hourPrice = input.nextDouble();

    System.out.print("Quantas horas você trabalhou no mês? ");
    int hoursWorked = input.nextInt();

    grossSalary = hourPrice * hoursWorked;

    if (grossSalary <= 900) {
      incomeTax = 0;
    } else if (grossSalary <= 1500) {
      incomeTax = 5;
    } else if (grossSalary <= 2500) {
      incomeTax = 10;
    } else {
      incomeTax = 20;
    };

    syndicateShare = (grossSalary * syndicateTax) / 100;
    fgtsShare = (grossSalary * fgtsTax) / 100;
    incomeShare = (grossSalary * incomeTax) / 100;
    totalDiscounts = syndicateShare + incomeShare;

    netSalary = grossSalary - totalDiscounts;

    System.out.println("\nSalário bruto: R$" + grossSalary);
    System.out.println("Imposto de renda(" + (incomeTax == 0 ? ("Isento") : (incomeTax + "%")) + "): R$" + incomeShare);
    System.out.println("Sindicato(" + syndicateTax + "%): R$" + syndicateShare);
    System.out.println("FGTS(" + fgtsTax + "%): R$" + fgtsShare);
    System.out.println("Total de descontos: R$" + totalDiscounts);
    System.out.println("Salário liquido: R$" + netSalary);
  }
}
