import java.util.Scanner;

public class Exercise02 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-----------------------");
    System.out.println("  SISTEMA DE CADASTRO  ");
    System.out.println("-----------------------\n");

    System.out.print("Insira o nome de usuário: ");
    String userName = input.next();

    String password;
    boolean isUserNameEqualsPassword;
    
    do {
      isUserNameEqualsPassword = false;

      System.out.print("Digite sua senha: ");
      password = input.next();
      
      if (userName.equals(password)) {
        System.out.println("\nSenha não pode ser igual ao nome de usuário. Tente novamente.");
        isUserNameEqualsPassword = true;
      };
    } while (isUserNameEqualsPassword);

    System.out.println("\nCadastro realizado com sucesso.");
  }
}
