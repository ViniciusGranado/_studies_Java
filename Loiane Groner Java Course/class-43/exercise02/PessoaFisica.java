package exercise02;

public class PessoaFisica extends Contribuinte {

  PessoaFisica (String nome, double rendaBruta) {
    super(nome, rendaBruta);
  }

  public double getTax () {
    double totalTaxPaid;
    double renda = super.getRendaBruta();

    if (renda <= 1400) {
      totalTaxPaid = 0;
    } else if (renda <= 2100) {
      totalTaxPaid = renda * 0.1;
    } else if (renda <= 2800) {
      totalTaxPaid = renda * 0.15;
    } else if (renda <= 3600) {
      totalTaxPaid = renda * 0.25;
    } else {
      totalTaxPaid = renda * 0.3;
    }

    return totalTaxPaid;
  }

  public String getString () {
    return "Nome do contribuinte: " + super.getNome() + "\nImposto: R$: " + getTax();
  }
 }
