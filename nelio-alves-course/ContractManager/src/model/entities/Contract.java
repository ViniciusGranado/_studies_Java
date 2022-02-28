package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
  private String number;
  private Date date;
  private Double value;
  private List<Installment> installments;

  public Contract() {}

  public Contract(String number, Date date, Double value) {
    this.number = number;
    this.date = date;
    this.value = value;
    installments = new ArrayList<>();
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

  public List<Installment> getInstallments() {
    return installments;
  }

  public void setInstallments(List<Installment> installments) {
    this.installments = installments;
  }

  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder();

    for(Installment installment : installments) {
      ret.append(installment).append("\n");
    }

    return ret.toString();
  }
}
