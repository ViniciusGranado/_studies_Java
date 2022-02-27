package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Contract {
  private String number;
  private Date date;
  private Double value;
  private List<Installment> installments;

  public Contract() {}

  public Contract(String number, Date date, Double value, List<Installment> installments) {
    this.number = number;
    this.date = date;
    this.value = value;
    this.installments = installments;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    StringBuilder ret = new StringBuilder();

    for(Installment installment : installments) {
      ret.append(sdf.format(installment.getDueDate())).append(" - ").append(installment.amount).append("\n");
    }

    return ret.toString();
  }
}
