import java.util.Scanner;

public class Exercise11 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double salary, readjustmentValue, newSalary;
    int readjustmentRate;

    System.out.println("-----------------------");
    System.out.println("  CÁLCULO DE REAJUSTE  ");
    System.out.println("-----------------------\n");

    System.out.print("Digite o salário atual do funcionário: R$");
    salary = input.nextDouble();
    
    if (salary <= 280) {
      readjustmentRate = 20;
    } else if (salary < 700) {
      readjustmentRate = 15;
    } else if (salary < 1500) {
      readjustmentRate = 10;
    } else {
      readjustmentRate = 5;
    }
    
    readjustmentValue = (salary * readjustmentRate) / 100;
    newSalary = salary + readjustmentValue;

    System.out.println("O salário do funcionário era R$" + salary);
    System.out.println("O percentual de reajuste será de " + readjustmentRate + "%");
    System.out.println("O reajuste será de R$" + readjustmentValue);
    System.out.println("O novo salário do funcionário será R$" + newSalary);
  }

}
