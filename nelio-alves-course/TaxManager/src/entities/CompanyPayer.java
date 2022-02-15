package entities;

public class CompanyPayer extends Payer {
  private Integer numberOfEmployees;

  public CompanyPayer(String name, Double anualIncome, Integer numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public Double total() {
    int taxRate = numberOfEmployees > 10 ? 14 : 16;

    return getAnualIncome() * (taxRate / 100.0);
  }
}
