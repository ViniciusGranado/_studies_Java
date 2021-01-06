import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise32 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat(".00");

    int productCode;
    boolean isProductCodeValid;
    int productQuant;  
    boolean isProductQuantValid;
    boolean wishesToContinue = true;
    String productName = "";
    double productPrice = 0;
    double productFinalPrice;
    double finalPrice = 0;
    String finalReceipt;

    do {
      finalReceipt = "\n";
      finalReceipt += "\n----------------------------\n";
      finalReceipt += "        CUPOM FISCAL";
      finalReceipt += "\n----------------------------\n";

      System.out.println("----------------------------------");
      System.out.println("             CARDÁPIO             ");
      System.out.println("----------------------------------\n");
      
      System.out.println("Produto           Código   Preço");
      System.out.println("----------------------------------");
      System.out.println("Cachorro Quente   100      R$ 1,20");
      System.out.println("Bauru Simples     101      R$ 1,30");
      System.out.println("Bauru com ovo     102      R$ 1,50");
      System.out.println("Hambúrguer        103      R$ 1,20");
      System.out.println("Cheeseburguer     104      R$ 1,30\n");

      do {

        do {
          wishesToContinue = true;
          isProductCodeValid = true;
          
          System.out.print("Digite o código do produto ou 0 para finalizar pedido: ");
          productCode = scanner.nextInt();
          
          if ((productCode >= 100 && productCode <= 104) || productCode == 0) {
            if (productCode == 0) {
              break;
            } else {
              switch (productCode) {
                case 100:
                  productName = "Cachorro Quente";                
                  productPrice = 1.20;
                  finalReceipt += productName + " x ";
                  break;
                case 101:
                  productName = "Bauru Simples";               
                  productPrice = 1.30;
                  finalReceipt += productName + " x ";
                  break;
                case 102:
                  productName = "Bauru com Ovo";               
                  productPrice = 1.50;
                  finalReceipt += productName + " x ";
                  break;
                case 103:
                  productName = "Hambúrguer";               
                  productPrice = 1.20;
                  finalReceipt += productName + " x ";
                  break;
                case 104:
                  productName = "Cheeseburguer";               
                  productPrice = 1.30;
                  finalReceipt += productName + " x ";
                  break;
                case 105:
                  productName = "Refrigerante";               
                  productPrice = 1.00;
                  finalReceipt += productName + " x ";
                  break;
              }
  
              do {
                isProductQuantValid = true;
  
                System.out.print("Quantidade de \"" + productName + "\": ");
                productQuant = scanner.nextInt();
  
                if (productQuant > 0) {
                  productFinalPrice = productPrice * productQuant;
                  finalPrice += productFinalPrice;
                  finalReceipt += productQuant + " = R$" + format.format(productFinalPrice) + "\n";

                  System.out.println(); // Skip line
                } else {
                  System.out.println("Quantidade inválida, tente novamente.\n");
                  isProductQuantValid = false;
                }
              } while (!isProductQuantValid);
            }
          } else {
            System.out.println("Código inválido, tente novamente.\n");
            isProductCodeValid = false;
          }
        } while (!isProductCodeValid); 
        if (productCode == 0) {
          wishesToContinue = false;
        };
      } while (wishesToContinue);
  
      finalReceipt += "----------------------------\n";
      finalReceipt += "Total do pedido: R$" + format.format(finalPrice);
      finalReceipt += "\n----------------------------\n";

      System.out.println(finalReceipt);

      // Wishes to continue section
      char userAnswer;
      boolean isUserAnswerValid;
      wishesToContinue = true;
      
      do {
        isUserAnswerValid = true;

        System.out.print("Deseja realizar outro pedido: [S/N] ");
        userAnswer = Character.toUpperCase(scanner.next().charAt(0));

        if (userAnswer == 'S' || userAnswer == 'N') {
          if (userAnswer == 'N') {
            wishesToContinue = false;
          };
        } else {
          System.out.println("Resposta inválida, tente novamente.\n");
          isUserAnswerValid = false;
        }
      } while (!isUserAnswerValid);
    } while (wishesToContinue);
  }
}
