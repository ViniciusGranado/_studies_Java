package model.services;

import model.entities.Installment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InstallmentCalculator {
  public static Calendar calendar = Calendar.getInstance();

  public static List<Installment> calculate(Date initialDate, double totalValue, int installmentsNumber, TaxService taxService) {
    List<Installment> installments = new ArrayList<>();
    calendar.setTime(initialDate);

    double baseInstallment = totalValue / installmentsNumber;

    for (int i = 1; i <= installmentsNumber; i++) {
      calendar.add(Calendar.MONTH, 1);

      double installmentAmount = baseInstallment + (baseInstallment * taxService.simpleInterest() / 100 * i);
      installmentAmount += installmentAmount * (taxService.paymentFee() / 100);

      installments.add(new Installment(calendar.getTime(), installmentAmount));
    }

    return installments;
  }
}
