package model.services;

public class PayPalTaxService implements TaxService{

  @Override
  public double simpleInterest() {
    return 1;
  }

  @Override
  public double paymentFee() {
    return 2;
  }
}
