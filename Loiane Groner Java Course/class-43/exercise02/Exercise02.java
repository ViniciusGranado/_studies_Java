package exercise02;

public class Exercise02 {
  public static void main (String[] args) {
    PessoaFisica pessoaFisica01 = new PessoaFisica("João", 2500);
    PessoaFisica pessoaFisica02 = new PessoaFisica("Marcos", 1760);
    PessoaFisica pessoaFisica03 = new PessoaFisica("Carla", 45000);
    PessoaJuridica pessoaJuridica01 = new PessoaJuridica("PCInc", 370000);
    PessoaJuridica pessoaJuridica02 = new PessoaJuridica("GMC", 1785250);
    PessoaJuridica pessoaJuridica03 = new PessoaJuridica("SDC", 260011);

    System.out.println(pessoaFisica01.getString());
    System.out.println(pessoaFisica02.getString());
    System.out.println(pessoaFisica03.getString());
    System.out.println(pessoaJuridica01.getString());
    System.out.println(pessoaJuridica02.getString());
    System.out.println(pessoaJuridica03.getString());
  }
}
