package exercise04;
import java.util.Scanner;

import exercise04.Game.Game;

public class Exercise04 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    Game game = new Game();
    
    String currentPlayer;
    int currentPlay;
    boolean isPlayValid;

    do {
      currentPlayer = game.getPlayNumber() % 2 == 0 ? "Jogador 1" : "Jogador 2";

      game.showGame();

      // Get user play
      do {
        System.out.print("\n" + currentPlayer + ", digite o número que deseja jogar: ");
        currentPlay = input.nextInt();

        isPlayValid = game.validatePlay(currentPlay);

      } while (!isPlayValid);

      System.out.println();
    } while (!game.checkIfGameHasEnded());

    // Print game results
    System.out.println("\nJOGO FINALIZADO!");
    if (game.getPlayNumber() < 9) {
      System.out.println(currentPlayer + " ganhou");
    } else {
      System.out.println("Deu velha!");
    }
    input.close();
  }
}
