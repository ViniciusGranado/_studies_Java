package exercise02;

public class PessoaJuridica  extends Contribuinte{
    PessoaJuridica (String nome, double rendaBruta) {
      super(nome, rendaBruta);
    }

  public double getTax () {
    double totalTaxPaid;

    totalTaxPaid = super.getRendaBruta() * 0.1;

    return totalTaxPaid;
  }

  public String getString () {
    return "Nome da empresa: " + super.getNome() + "\nImposto: R$: " + getTax();
  }
}
