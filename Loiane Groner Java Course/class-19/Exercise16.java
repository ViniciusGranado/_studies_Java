import java.util.Scanner;

public class Exercise16 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };
    
    int sumBellow15 = 0;
    int valuesEquals15 = 0;
    double sumAbove15 = 0;
    double valuesAbove15 = 0;
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] < 15) {
        sumBellow15 += arrayA[i];
      } else if (arrayA[i] > 15) {
        valuesAbove15++;
        sumAbove15 += arrayA[i];
      } else {
        valuesEquals15++;
      };
    }

    System.out.println("A soma dos elementos menores que 15 é "+ sumBellow15);
    System.out.println("A quantidade de elementos iguais à 15 é " + valuesEquals15);
    System.out.println("A média dos valores maiores que 15 é " + (sumAbove15 / valuesAbove15));

    input.close();
  }
}
