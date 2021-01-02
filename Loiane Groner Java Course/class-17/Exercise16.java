public class Exercise16 {
  public static void main (String[] args) {
    int num1 = 1;
    int num2 = 1;
    int aux;

    System.out.print(num1 + ", ");
    System.out.print(num2 + ", ");

    while (true) {
      aux = num1 + num2;
      num1 = num2;
      num2 = aux;

      if (num2 >= 500) {
        System.out.print(num2);
        break;
      };

      System.out.print(num2 + ", ");
    };
  }
}
