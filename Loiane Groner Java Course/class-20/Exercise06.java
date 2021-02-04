import java.util.Scanner;

public class Exercise06 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    char[][] game = new char[3][3];
    boolean gameHasEnded = false;
    int counter;
    String currentPlayer;
    int playNumber = 0;
    int currentPlay;
    boolean isPlayValid;
    int line;
    int column;

    do {
      if (playNumber % 2 == 0) {
        currentPlayer = "Jogador 1";
      } else {
        currentPlayer = "Jogador 2";
      }

      // Show game
      counter = 1;
      for (int i = 0; i < game.length; i++) {
        for (int j = 0; j < game.length; j++) {
          if (game[i][j] == 0) {
            System.out.print("   " + counter);
          } else {
            System.out.print("   " + game[i][j]);
          }
          
          if (j == 2) {
            System.out.print("");
          } else {
            System.out.print("   |");
          }

          counter++;
        }
        if (i != 2) {
          System.out.println("\n------------------------");
        } else {
          System.out.println();
        }
      }

      // Get user play
      do {
        isPlayValid = true;

        System.out.print("\n" + currentPlayer + ", digite o número que deseja jogar: ");
        currentPlay = input.nextInt();

        if (currentPlay < 1 || currentPlay > 9) {
          isPlayValid = false;
        } else {
          line = (int) (currentPlay - 1) / game.length;
          column = (currentPlay - 1) % game.length;

          if (game[line][column] != 0) {
            System.out.println("Jogada inválida.");
            isPlayValid = false;
          } else {
            game[line][column] = playNumber % 2 == 0 ? 'X' : 'O';
          }
        }

      } while (!isPlayValid);

      System.out.println();

      // Check if game has ended
      for (int i = 0; i < game.length; i++) {
        if (game[i][0] == 'X' && game[i][1]  == 'X'&& game[i][2] == 'X') {
          gameHasEnded = true;
        }
        if (game[i][0] == 'O' && game[i][1]  == 'O'&& game[i][2] == 'O') {
          gameHasEnded = true;
        }
        if (game[0][i] == 'X' && game[1][i]  == 'X'&& game[2][i] == 'X') {
          gameHasEnded = true;
        }
        if (game[0][i] == 'O' && game[1][i]  == 'O'&& game[2][i] == 'O') {
          gameHasEnded = true;
        }
      }

      if (game[0][0] == 'X' && game[1][1]  == 'X'&& game[2][2] == 'X') {
        gameHasEnded = true;
      }
      if (game[0][0] == 'O' && game[1][1]  == 'O'&& game[2][2] == 'O') {
        gameHasEnded = true;
      }
      if (game[0][2] == 'X' && game[1][1]  == 'X'&& game[2][0] == 'X') {
        gameHasEnded = true;
      }
      if (game[0][2] == 'O' && game[1][1]  == 'O'&& game[2][0] == 'O') {
        gameHasEnded = true;
      }

      playNumber++;

      if (playNumber == 9) {
        gameHasEnded = true;
      }
    } while (!gameHasEnded);

    // Print game results
    System.out.println("\nJOGO FINALIZADO!");
    if (playNumber < 9) {
      System.out.println(currentPlayer + " ganhou");
    } else {
      System.out.println("Deu velha!");
    }
    input.close();
  }
}
