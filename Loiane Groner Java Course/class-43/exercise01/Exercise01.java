package exercise01;

public class Exercise01 {
  public static void main (String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria("Vinícius Granado", 1234, 2015.56);
    ContaPoupanca contaPoupanca = new ContaPoupanca("Marcos dos Santos", 1235, 3021.45, 15);
    ContaEspecial contaEspecial = new ContaEspecial("Carla Rodrigues", 1236, 3562, 5000);

    contaBancaria.sacar(2000);
    contaPoupanca.sacar(4000);
    contaEspecial.sacar(4000);

    System.out.println();

    contaBancaria.depositar(200);
    contaPoupanca.depositar(1000);
    contaEspecial.depositar(3000);

    System.out.println();

    System.out.println(contaBancaria.toString());
    System.out.println();
    System.out.println(contaPoupanca.toString());
    System.out.println();
    System.out.println(contaEspecial.toString());

    System.out.println();

  contaPoupanca.calcularNovoSaldo(5);
  }
}