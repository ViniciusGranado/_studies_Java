import java.util.Scanner;

public class Exercise04 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Digite a primeira nota: ");
    double sumGrades = scan.nextDouble();

    System.out.print("Digite a segunda nota: ");
    sumGrades += scan.nextDouble();
    
    System.out.print("Digite a terceira nota: ");
    sumGrades += scan.nextDouble();
    
    System.out.print("Digite a quarta nota: ");
    sumGrades += scan.nextDouble();
    
    System.out.println("A média das notas é: " + sumGrades / 4);
  }
}