public class Exercise04 {
  public static void main (String[] args) {
    double countryAPopulation = 80000;
    int countryAGrowthRate = 3;

    double countryBPopulation = 200000;
    double countryBGrowthRate = 1.5;

    int years = 0;

    while (countryAPopulation < countryBPopulation) {
      years++;

      countryAPopulation += (countryAPopulation * countryAGrowthRate / 100);
      countryBPopulation += (countryBPopulation * countryBGrowthRate / 100);
    };

    System.out.println("População do país A: " + countryAPopulation);
    System.out.println("População do país B: " + countryBPopulation);
    System.out.println("Foram necessários " + years + " anos para que a população do país A ultrapassasse a do país B.");
  }

}
