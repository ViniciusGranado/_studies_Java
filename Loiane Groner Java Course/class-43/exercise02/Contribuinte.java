package exercise02;

public abstract class Contribuinte {
  private String nome;
  private double rendaBruta;

  Contribuinte (String nome, double rendaBruta) {
    this.nome = nome;
    this.rendaBruta = rendaBruta;
  }

  public String getNome () {
    return nome;
  }

  public void setNome (String nome) {
    this.nome = nome;
  }

  public double getRendaBruta () {
    return rendaBruta;
  }

  public void setRendaBruta (double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }

  public abstract double getTax();
  
  public abstract String getString();
}
