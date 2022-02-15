package entities;

public abstract class Payer {
  private String name;
  private Double anualIncome;

  public Payer(String name, Double anualIncome) {
    this.name = name;
    this.anualIncome = anualIncome;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getAnualIncome() {
    return anualIncome;
  }

  public void setAnualIncome(Double anualIncome) {
    this.anualIncome = anualIncome;
  }

  public abstract Double total();

  @Override
  public String toString() {
    return String.format("%s: $ %.2f", name, total());
  }
}
