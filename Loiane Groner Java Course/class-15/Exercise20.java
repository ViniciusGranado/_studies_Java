import java.util.Scanner;

public class Exercise20 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("---------------");
    System.out.println("  SISTEMA POLICIAL  ");
    System.out.println("---------------\n");

    System.out.println("Responda as perguntas abaixo: \n");

    int numberOfAffirmativeAnswers = 0;

    System.out.print("Telefonou para a vítima? [S/N] ");
    numberOfAffirmativeAnswers += Character.toUpperCase(input.next().charAt(0)) == 'S' ? 1 : 0;

    System.out.print("Esteve no local do crime? [S/N] ");
    numberOfAffirmativeAnswers += Character.toUpperCase(input.next().charAt(0)) == 'S' ? 1 : 0;

    System.out.print("Mora perto da vítima? [S/N] ");
    numberOfAffirmativeAnswers += Character.toUpperCase(input.next().charAt(0)) == 'S' ? 1 : 0;

    System.out.print("Devia para a vítima? [S/N] ");
    numberOfAffirmativeAnswers += Character.toUpperCase(input.next().charAt(0)) == 'S' ? 1 : 0;

    System.out.print("Já  trabalhou  com  a  vítima? [S/N] ");
    numberOfAffirmativeAnswers += Character.toUpperCase(input.next().charAt(0)) == 'S' ? 1 : 0;

    String status;

    if (numberOfAffirmativeAnswers == 5) {
      status = "Assassino";
    } else if (numberOfAffirmativeAnswers >= 3) {
      status = "Cúmplice";
    } else if (numberOfAffirmativeAnswers == 2) {
      status = "Suspeito";
    } else {
      status = "Inocente";
    };

    System.out.println("\nO seu status é: " + status);
  }
}
