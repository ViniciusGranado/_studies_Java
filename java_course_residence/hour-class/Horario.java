// Alunos
// Marilia Franco de Andrade
// Vinicius Rafael Granado

public class Horario implements Cloneable, Comparable<Horario> {
  private byte hora;
  private byte minuto;
  private byte segundo;

  private boolean validaHorario (byte hora, byte minuto, byte segundo) {
    if (hora < 0 || hora > 23) return false;
    if (minuto < 0 || minuto > 59) return false;
    if (segundo < 0 || segundo > 59) return false;

    return true;
  }

  // constructors
  Horario(byte hora, byte minuto, byte segundo) throws Exception {
    if (!this.validaHorario(hora, minuto, segundo)) {
      throw new Exception("Horário inválido");
    };

    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  Horario(Horario model) throws Exception {
    if (model == null) {
      throw new Exception("Modelo ausente");
    };

    this.hora = model.hora;
    this.minuto = model.minuto;
    this.segundo = model.segundo;
  }

  // clone
  public Object clone() {
    Horario ret = null;

    try {
      ret = new Horario(this);
    } catch(Exception e) {}

    return ret;
  }

  //getters
  public byte getHora() {
    return this.hora;
  }

  public byte getMinuto() {
    return this.minuto;
  }

  public byte getSegundo() {
    return this.segundo;
  }

  //setters
  public void setHora(byte hora) throws Exception {
    if (!this.validaHorario(hora, this.minuto, this.segundo)) {
      throw new Exception("Hora inválida");
    };

    this.hora = hora;
  }

  public void setMinuto(byte minuto) throws Exception {
    if (!this.validaHorario(this.hora, minuto, this.segundo)) {
      throw new Exception("Minuto inválido");
    };

    this.minuto = minuto;
  }

  public void setSegundo(byte segundo) throws Exception {
    if (!this.validaHorario(this.hora, this.minuto, segundo)) {
      throw new Exception("Segundo inválido");
    };

    this.segundo = segundo;
  }

  // toString
  @Override
  public String toString() {
    return String.format("%02d", this.hora) + ":" +
           String.format("%02d", this.minuto) + ":" +
           String.format("%02d", this.segundo);
  }

  // equals
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (this.getClass() != obj.getClass()) return false;

    Horario horario = (Horario) obj;

    return (this.hora == horario.hora &&
            this.minuto == horario.minuto &&
            this.segundo == horario.segundo);
  }

  // hashCode
  @Override
  public int hashCode() {
    int hash = 123;

    hash = 13 * hash + new Byte(this.hora).hashCode();
    hash = 13 * hash + new Byte(this.minuto).hashCode();
    hash = 13 * hash + new Byte(this.segundo).hashCode();

    if (hash < 0) hash = -hash;

    return hash;
  }

  // compareTo
  public int compareTo(Horario horario) {
    if (this.hora < horario.hora) return -1;
    if (this.hora > horario.hora) return 1;
    if (this.minuto < horario.minuto) return -1;
    if (this.minuto < horario.minuto) return 1;
    if (this.segundo < horario.segundo) return -1;
    if (this.segundo < horario.segundo) return 1;

    return 0;
  }
}