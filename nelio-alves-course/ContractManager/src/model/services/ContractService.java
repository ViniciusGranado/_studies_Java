package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
  private OnlinePaymentService onlinePaymentService;

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, int months) {
    double basicQuota = contract.getValue() / months;

    for (int i = 1; i <= months; i++) {
      double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
      double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

      Date dueDate = addMonths(contract.getDate(), i);

      contract.getInstallments().add(new Installment(dueDate, fullQuota));
    }
  }

  private Date addMonths(Date date, int N) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.MONTH, N);

    return calendar.getTime();
  }
}
