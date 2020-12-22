import java.util.Scanner;

public class Exercise05 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double countryAPopulation;
    double countryAGrowthRate;
    double countryBPopulation;
    double countryBGrowthRate;
    boolean wishToContinue;
    boolean isValueValid;
    char userOption;
    
    do {
      wishToContinue = false;
      
      do {
        isValueValid = true;
        
        System.out.print("Digite a população inicial do país A: ");
        countryAPopulation = input.nextDouble();

        if (countryAPopulation < 0) {
          isValueValid = false;
          System.out.println("Valor inválido, tente novamente.");
        }
      } while (!isValueValid);

      do {
        isValueValid = true;

        System.out.print("Digite a taxa de crescimento populacional do país A: ");
        countryAGrowthRate = input.nextDouble();

        if (countryAGrowthRate < 0 || countryAGrowthRate > 100) {
          isValueValid = false;
          System.out.println("Valor inválido, tente novamente.");
        }
      } while (!isValueValid);

      do {
        isValueValid = true;

        System.out.print("Digite a população inicial do país B: ");
        countryBPopulation = input.nextDouble();

        if (countryBPopulation < 0) {
          isValueValid = false;
          System.out.println("Valor inválido, tente novamente.");
        }
      } while (!isValueValid);

      do {
        isValueValid = true;
        
        System.out.print("Digite a taxa de crescimento populacional do país B: ");
        countryBGrowthRate = input.nextDouble();

        if (countryBGrowthRate < 0 || countryBGrowthRate > 100) {
          isValueValid = false;
          System.out.println("Valor inválido, tente novamente.");
        }
      } while (!isValueValid);
  
      int years = 0;
  
      while (countryAPopulation < countryBPopulation) {
        years++;
  
        countryAPopulation += (countryAPopulation * countryAGrowthRate / 100);
        countryBPopulation += (countryBPopulation * countryBGrowthRate / 100);
      };
  
      System.out.println("\nPopulação do país A: " + countryAPopulation);
      System.out.println("População do país B: " + countryBPopulation);
      System.out.println("Foram necessários " + years + " anos para que a população do país A ultrapassasse a do país B.\n");

      System.out.print("Deseja realizar outro cálculo? [S/N] ");
      userOption = input.next().charAt(0);

      if (Character.toUpperCase(userOption) == 'S') {
        System.out.println();
        wishToContinue = true;
      };
    } while (wishToContinue);

    System.out.println("\nFinalizando...");
  }
}
