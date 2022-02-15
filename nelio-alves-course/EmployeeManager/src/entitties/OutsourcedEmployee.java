package entitties;

public class OutsourcedEmployee extends Employee {
  private final double bonusRate = 1.1;
  private Double additionalCharge;

  public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
  }

  public double getBonusRate() {
    return bonusRate;
  }

  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  @Override
  public Double payment() {
    return super.payment() + (additionalCharge * bonusRate);
  }

}
