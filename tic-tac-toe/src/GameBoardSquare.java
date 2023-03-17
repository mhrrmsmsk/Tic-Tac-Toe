import java.util.Scanner;

public class GameBoardSquare {
  GameBoard gameBoard =new GameBoard();

private String storedSymbol;
public void setStoredSymbolSymbol(String storedSymbol){
    this.storedSymbol=storedSymbol;

}
public void GetStoredValue(Player player1,Player player2){
   player1.setPlayerSymbol("X");
   player2.setPlayerSymbol("O");
}
public boolean isSquareEmpty()
{
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; i++)
        {
            if (gameBoard.board[i][j] == "-")
            {
                return true;
            }
        }
    }
    return false;
}
}
