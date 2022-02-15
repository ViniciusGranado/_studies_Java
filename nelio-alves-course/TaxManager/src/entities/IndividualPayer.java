package entities;

public class IndividualPayer extends Payer {
  private Double healthExpenditures;

  public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double total() {
    int taxRate = getAnualIncome() < 20000 ? 15 : 25;

    return (getAnualIncome() * (taxRate / 100.0)) - (healthExpenditures * (50 / 100.0));
  }
}
