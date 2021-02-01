import java.util.Scanner;
import java.util.Calendar;

public class Exercise04 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    // Get year and determine if it's bisext
    Calendar calendar = Calendar.getInstance();
    int year = calendar.get(Calendar.YEAR);
    boolean isBisext;

    isBisext = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));

    // Assign schedule array
    String[][][] schedule = new String[12][][];

    for (int i = 0; i < schedule.length; i++) {
      switch (i + 1) {
        case 1: // Janeiro
        case 3: // Março
        case 5: // Maio
        case 7: // Julho
        case 8: // Agosto
        case 10: // Outubro
        case 12: // Dezembro
          schedule[i] = new String[31][24];
          break;
          
        case 4: // Abril
        case 6: // Junho
        case 9: // Setembro
        case 11: // Novembro
          schedule[i] = new String[30][24];
          break;

        case 2: // Fevereiro
          schedule[i] = new String[isBisext ? 29 : 28][24];
          break;

        default:
          System.out.println("[ERRO]");
          break;
      };
    };

    // Show menu
    int option;
    int month;
    int day;
    int hour;
    String appointment;

    do {
      System.out.println("----------------------------------------");
      System.out.println("                  AGENDA");
      System.out.println("----------------------------------------\n");
      System.out.println("[1] Cadastrar novo compromisso");
      System.out.println("[2] Consultar compromisso");
      System.out.println("[3] Apagar compromisso");
      System.out.println("[0] Sair");
      
      System.out.print("\nOpção: ");
      option = input.nextInt();

      switch (option) {
        case 1:
          System.out.print("\nDigite o dia desejado: ");
          day = input.nextInt() - 1;
          System.out.print("Digite o mês desejado: ");
          month = input.nextInt() - 1;
          System.out.print("Digite a hora desejada: ");
          hour = input.nextInt() - 1;

          System.out.print("Digite o compromisso que deseja cadastrar no dia " + (day + 1) + "/" + (month + 1) +": ");
          input.nextLine(); // Clear keyboard buffer
          appointment = input.nextLine();

          schedule[month][day][hour] = appointment;

          System.out.println("\nCadastro realizado com sucesso.\n");
          break;
        case 2:
          System.out.print("\nDigite o dia que deseja consultar: ");
          day = input.nextInt() - 1;
          System.out.print("Digite o mês que deseja consultar: ");
          month = input.nextInt() - 1;
          System.out.print("Digite a hora que deseja consultar: ");
          hour = input.nextInt() - 1;

          if (schedule[month][day][hour] == null) {
            System.out.println("\nNão há compromissos cadastrados na data e hora informados.\n");
          } else {
            System.out.println("\nCompromisso do dia " + (day + 1) + "/" + (month + 1) + " às " + (hour + 1) + "Hrs: " + schedule[month][day][hour] + "\n");
          }
          break;
        case 3:
          System.out.print("\nDigite o dia que deseja apagar: ");
          day = input.nextInt() - 1;
          System.out.print("Digite o mês que deseja apagar: ");
          month = input.nextInt() - 1;
          System.out.print("Digite a hora que deseja apagar: ");
          hour = input.nextInt() - 1;

          if (schedule[month][day][hour] == null) {
            System.out.println("\nNão há compromissos cadastrados na data e hora informados.\n");
          } else {
            schedule[month][day][hour] = null;
            System.out.println("\nCadastro apagado com sucesso.\n");
          }

          break;
        case 0:
          System.out.println("\nSaindo...\n");
          break;
        default:
          System.out.println("\nOpção inválida.\n");
          break;
      }
    } while (option != 0);
    input.close();
  }
}