import java.util.Scanner;

public class Exercise04 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    Game game = new Game();
    
    String currentPlayer;
    int currentPlay;
    boolean isPlayValid;
    boolean gameHasEnded;

    do {
      if (game.playNumber % 2 == 0) {
        currentPlayer = "Jogador 1";
      } else {
        currentPlayer = "Jogador 2";
      }

      game.showGame();

      // Get user play
      do {
        System.out.print("\n" + currentPlayer + ", digite o número que deseja jogar: ");
        currentPlay = input.nextInt();

        isPlayValid = game.validatePlay(currentPlay);

      } while (!isPlayValid);

      System.out.println();

      // Check if game has ended
      gameHasEnded = game.checkIfGameHasEnded();
    } while (!gameHasEnded);

    // Print game results
    System.out.println("\nJOGO FINALIZADO!");
    if (game.playNumber < 9) {
      System.out.println(currentPlayer + " ganhou");
    } else {
      System.out.println("Deu velha!");
    }
    input.close();
  }
}
