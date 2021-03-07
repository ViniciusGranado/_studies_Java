package exercise01;

import java.util.Scanner;
import exercise01.Agenda.Agenda;
import exercise01.Agenda.Contato.Contato;

public class Exercise01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Agenda agenda = new Agenda();

    Contato[] contatos = new Contato[3];

    // Main
    System.out.println("---------------------------");
    System.out.println("           AGENDA          ");
    System.out.println("---------------------------\n");

    System.out.print("Digite o nome da agenda: ");
    agenda.setNomeAgenda(input.nextLine());

    for (int i = 0; i < 3; i++) {
      Contato contato = new Contato();

      System.out.println("\n---------------------------");
      System.out.println("Contato " + (i + 1) + ": ");
      System.out.print("Digite o nome do contato: ");
      contato.setNome(input.nextLine());
      System.out.print("Digite o telefone do contato: ");
      contato.setTelefone(input.nextLine());
      System.out.print("Digite o e-mail do contato: ");
      contato.setEmail(input.nextLine());
      System.out.println("---------------------------");

      contatos[i] = contato;
    }

    agenda.setContatos(contatos);

    if (agenda != null) {
      System.out.println("Nome da agenda: " + agenda.getNomeAgenda());
      System.out.println(agenda.getAllContacts());
    }

    input.close();
  }
}