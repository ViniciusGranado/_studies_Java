package exercise01.Agenda;

import exercise01.Agenda.Contato.Contato;

public class Agenda {
  private String nomeAgenda;
  private Contato[] contatos;

  public String getNomeAgenda() {
    return nomeAgenda;
  }

  public void setNomeAgenda(String nomeAgenda) {
    this.nomeAgenda = nomeAgenda;
  }

  public Contato[] getContatos() {
    return contatos;
  }

  public void setContatos(Contato[] contatos) {
    this.contatos = contatos;
  }

  public String getAllContacts() {
    String returnStatement = "";
    for (int i = 0; i < contatos.length; i++) {
      Contato contato = contatos[i];

      if (contato != null) {
        returnStatement += contato.getContact();
      }
    }

    return returnStatement;
  }
}
