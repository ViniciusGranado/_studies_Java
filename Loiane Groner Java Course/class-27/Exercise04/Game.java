public class Game {
  char[][] board = new char[3][3];
  int playNumber = 0;

  void showGame () {
    int counter = 1;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 0) {
          System.out.print("   " + counter);
        } else {
          System.out.print("   " + board[i][j]);
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
  }
  
  boolean validatePlay (int currentPlay) {
    if (currentPlay < 1 || currentPlay > 9) {
      return false;
    } else {
      int line = (int) (currentPlay - 1) / board.length;
      int column = (currentPlay - 1) % board.length;

      if (board[line][column] != 0) {
        System.out.println("Jogada inválida.");
        return false;
      } else {
        board[line][column] = playNumber % 2 == 0 ? 'X' : 'O';
      }
    }

    return true;
  }
  
  boolean checkIfGameHasEnded () {
    for (int i = 0; i < board.length; i++) {
      if (board[i][0] == 'X' && board[i][1]  == 'X'&& board[i][2] == 'X') {
        return true;
      }
      if (board[i][0] == 'O' && board[i][1]  == 'O'&& board[i][2] == 'O') {
        return true;
      }
      if (board[0][i] == 'X' && board[1][i]  == 'X'&& board[2][i] == 'X') {
        return true;
      }
      if (board[0][i] == 'O' && board[1][i]  == 'O'&& board[2][i] == 'O') {
        return true;
      }
    }

    if (board[0][0] == 'X' && board[1][1]  == 'X'&& board[2][2] == 'X') {
      return true;
    }
    if (board[0][0] == 'O' && board[1][1]  == 'O'&& board[2][2] == 'O') {
      return true;
    }
    if (board[0][2] == 'X' && board[1][1]  == 'X'&& board[2][0] == 'X') {
      return true;
    }
    if (board[0][2] == 'O' && board[1][1]  == 'O'&& board[2][0] == 'O') {
      return true;
    }

    playNumber++;

    if (playNumber == 9) {
      return true;
    }

    return false;
  }
}