public class Exercise22 {
  public static void main (String[] args) {
    int[] numbers = new int[10];
    int numbersEqual1 = 0;
    int numbersEqual0 = 0;
    int numbers1percent;
    int numbers0percent;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) Math.round(Math.random());
    }


    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 0) {
        numbersEqual0++;
      } else {
        numbersEqual1++;
      };
    };

    numbers0percent = (numbersEqual0 * 100) / numbers.length;
    numbers1percent = (numbersEqual1 * 100) / numbers.length;

    System.out.println("A porcentagem de números 0 no array é de " + numbers0percent + "%");
    System.out.println("A porcentagem de números 1 no array é de " + numbers1percent + "%");
  }
}
