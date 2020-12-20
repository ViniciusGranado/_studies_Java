import java.util.Scanner;

public class Exercise03 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-----------------------");
    System.out.println("  SISTEMA DE CADASTRO  ");
    System.out.println("-----------------------\n");

    String name;
    int age;
    double salary;
    char gender;
    char civilState;

    String genderName = "";
    String civilStateName = "";

    //Assign and validate name
    boolean isNameSmallerThan3Char;
    do {
      isNameSmallerThan3Char = false;

      System.out.print("Nome: ");
      name = input.next();
  
      if (name.length() <= 3) {
        System.out.println("\nO nome precisa ter mais de 3 caracteres. Tente novamente.\n");
        isNameSmallerThan3Char = true;
      }
    } while (isNameSmallerThan3Char);

    //Assign and validate age
    boolean isAgeBetween0And150;
    do {
      isAgeBetween0And150 = true;

      System.out.print("Idade: ");
      age = input.nextInt();
  
      if (age < 0 || age > 150) {
        System.out.println("\nValor inválido, tente novamente.\n");
        isAgeBetween0And150 = false;
      }
    } while (!isAgeBetween0And150);

    //Assign and validate salary
    boolean isSalaryBiggerThanZero = true;
    do {
      isSalaryBiggerThanZero = true;

      System.out.print("Salário: R$");
      salary = input.nextDouble();
  
      if (salary <= 0) {
        System.out.println("\nValor inválido. Tente novamente.\n");
        isSalaryBiggerThanZero = false;
      }
    } while (!isSalaryBiggerThanZero);
    

    //Assign and validate gender
    boolean isGenderValid;
    do {
      isGenderValid = true;

      System.out.print("Gênero: [M/F] ");
      gender = input.next().charAt(0);
  
      switch (Character.toUpperCase(gender)) {
        case 'M':
          genderName = "MASCULINO";
          break;
        case 'F':
          genderName = "FEMININA";
          break;
        default:
          System.out.println("\nOpção inválida, tente novamente.\n");
          isGenderValid = false;
          break;
      };
    } while (!isGenderValid);

    //Assign and validate civil state
    boolean isCivilStateValid ;
    do {
      isCivilStateValid = true;

      System.out.print("Estado civil [S/C/V/D]: ");
      civilState = input.next().charAt(0);
  
      System.out.println("oi");
      switch (Character.toUpperCase(civilState)) {
        case 'S':
          civilStateName = "SOLTEIR";
          break;
        case 'C':
          civilStateName = "CASAD";
          break;
        case 'V':
          civilStateName = "VIÚV";
          break;
        case 'D':
          civilStateName = "DIVORCIAD";
          break;
        default:
          System.out.println("\nOpção inválida, tente novamente.\n");
          isCivilStateValid = false;
          break;
      };
    } while (!isCivilStateValid);

    if (Character.toUpperCase(gender) == 'M') {
      civilStateName += "O";
    } else {
      civilStateName += "A";
    };

    // Show results
    System.out.println("\nCadastro realizado com sucesso.");
    System.out.println("NOME: " + name);
    System.out.println("IDADE: " + age);
    System.out.println("SALÁRIO: R$" + salary);
    System.out.println("GÊNERO: " + genderName);
    System.out.println("ESTADO CIVIL: " + civilStateName);
  }
}
