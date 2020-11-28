import java.util.Scanner;

public class Exercise14 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("---------------------");
    System.out.println("  TEMPO DE DOWNLOAD  ");
    System.out.println("---------------------\n");

    System.out.print("Digite o tamanho do arquivo em MB: ");
    double fileSize = input.nextDouble();

    System.out.print("Digite a velocidade de download em Mbs: ");
    double downloadSpeed = input.nextDouble();

    int megaByte = 8388608;
    int megaBit = 1048576;

    double downloadTime = ((fileSize * megaByte) / (downloadSpeed * megaBit)) / 60;

    System.out.println("O tempo de donwload será de " + downloadTime + " minutos.");
  }
}
