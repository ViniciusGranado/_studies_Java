package model.entities;

import java.util.Date;

public class Installment {
  public Date dueDate;
  public Double amount;

  public Installment() {}

  public Installment(Date dueDate, Double amount) {
    this.dueDate = dueDate;
    this.amount = amount;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public Double getAmount() {
    return amount;
  }
}
