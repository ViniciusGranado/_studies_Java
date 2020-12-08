import java.util.Scanner;

public class Exercise04 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite uma letra: ");
    char userLetter = input.next().charAt(0);

    switch (userLetter) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.print("Você digitou uma vogal.");
        break;
      case 'b':
      case 'c':
      case 'd':
      case 'f':
      case 'g':
      case 'h':
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'n':
      case 'p':
      case 'q':
      case 'r':
      case 's':
      case 't':
      case 'v':
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        System.out.print("Você digitou uma consoante.");
        break;
      default:
        System.out.print("Caractere inválido.");
        break;
    }
  }
}
