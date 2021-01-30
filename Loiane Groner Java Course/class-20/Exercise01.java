public class Exercise01 {
  public static void main (String[] args) {
    int[][] values = new int[4][4];
    int biggestValue;
    int line = 0;
    int column = 0 ;

    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        values[i][j] = (int) Math.round(Math.random() * 9); // Returns random value between 0 and 9 (inclusive);
      }
    }

    biggestValue = values[0][0];
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        if (values[i][j] > biggestValue) {
          biggestValue = values[i][j];
          line = i;
          column = j;
        };
      };
    };

    System.out.println("O maior valor gerado foi " + biggestValue + " que está na linha " + line + " e na coluna " + column);
  }
}