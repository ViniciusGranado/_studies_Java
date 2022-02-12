package entities;

import entitities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;
  private ArrayList<HourContract> contracts;

  public Worker(String name, WorkerLevel level, Double baseSalary, Integer numberOfContracts) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.contracts = new ArrayList<HourContract>(numberOfContracts);
  }

  public ArrayList<HourContract> getContracts() {
    return contracts;
  }

  public void setContracts(ArrayList<HourContract> contracts) {
    this.contracts = contracts;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    this.contracts.remove(contract);
  }

  public Double income(Integer month, Integer year) {
    Calendar calendar = Calendar.getInstance();
    Double income = 0.0;

    for(HourContract contract : contracts) {
      calendar.setTime(contract.getDate());
      int contractMonth = calendar.get(Calendar.MONTH);
      int contractYear = calendar.get(Calendar.YEAR);

      if (contractMonth == month && contractYear == year) {
        income += contract.totalValue();
      }
    }

    return income + baseSalary;
  }

  @Override
  public String toString() {
    return "Worker{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", baseSalary=" + baseSalary +
            '}';
  }
}
