public class Exercise02 {
  public static void main (String[] args) {
    int[][] values = new int[10][10];
    int biggestValueLine5;
    int smallestValueLine5;
    int biggestValueColumn7;
    int smallestValueColumn7;

    // Insert random values on the array
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        values[i][j] = (int) Math.round(Math.random() * 9); // Returns random value between 0 and 9 (inclusive);
      }
    }

    // Get biggest and smallest values on line 5
    biggestValueLine5 = values[5][0];
    smallestValueLine5 = values[5][0];
    for (int column = 1; column < values[5].length; column++) {
      if (values[5][column] > biggestValueLine5) {
        biggestValueLine5 = values[5][column];
      };
      if (values[5][column] < smallestValueLine5) {
        smallestValueLine5 = values[5][column];
      };
    };

    // Get biggest and smallest values on column 7
    biggestValueColumn7 = values[0][7];
    smallestValueColumn7 = values[0][7];
    for (int line = 1; line < values[7].length; line++) {
      if (values[line][7] > biggestValueColumn7) {
        biggestValueColumn7 = values[line][7];
      };
      if (values[line][7] < smallestValueColumn7) {
        smallestValueColumn7 = values[line][7];
      };
    };

    // Print the array
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        System.out.print(values[i][j] + "     ");
      }
      System.out.println("\n");
    }

    // Print the result
    System.out.println("O maior valor da linha 5 é " + biggestValueLine5);
    System.out.println("O menos valor da linha 5 é " + smallestValueLine5);
    System.out.println("O maior valor da coluna 7 é " + biggestValueColumn7);
    System.out.println("O menor valor da coluna 7 é " + smallestValueColumn7);
  }
}