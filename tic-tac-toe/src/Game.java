import java.util.Locale;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    public void getUserInfo() {
        System.out.println("Enter Player1 Name:");
     player1.setUserName(scanner.nextLine());
        System.out.println("Enter Player1 Victory Phrase:");
        player1.setVictoryPhrase(scanner.nextLine());
        System.out.println("Enter Player2 Name:");
        player2.setUserName(scanner.nextLine());
        System.out.println("Enter Player2 Victory Phrase:");
        player2.setVictoryPhrase(scanner.nextLine());

    }


    Player player1 = new Player("Destroyer", "The elephants can fly.");
    Player player2 = new Player("Fearless Panda" , "I'm not afraid.");
    Player gamningPlayer = player2;
    GameBoard gameBoard = new GameBoard();
    GameBoardSquare gameBoardSquare = new GameBoardSquare();




    public void initGame(){
        this.getUserInfo();
        this.gameBoard.initGame();
        this.gameBoardSquare.GetStoredValue(player1,player2);
        while(!gameBoard.checkGameFinished()){
            this.setPlayers();
            this.replaceGame();
            this.gameBoard.draw();
        }
        this.stopGame();
    }

    public int setScore(){
        return gamningPlayer.score++;
    }

    public Player setPlayers(){
        if(this.gamningPlayer==player2){
            this.gamningPlayer = player1;
        } else if (this.gamningPlayer==player1) {
            this.gamningPlayer = player2;
        }
        System.out.println(" ");
        System.out.println("It is on "+ gamningPlayer.getUserName()+".");
        return this.gamningPlayer;
    }

    public void replaceGame(){
        System.out.println("Where will you game in row(starts from scratch): ");
        int x = scanner.nextInt();
        System.out.println("Where will you game in column(starts from scratch): ");
        int y = scanner.nextInt();
        if (0<=x && x<3 || 0<=y && y<3 ){
            gameBoard.board[x][y] = this.gamningPlayer.getPlayerSymbol();
        }
        else {
            System.out.println("Please enter valid value !");
            this.replaceGame();
        }
    }

    public void stopGame(){
        if (gameBoard.checkGameFinished()){
            this.setScore();
            System.out.println("The Winning player: " +gamningPlayer.getUserName().toUpperCase());
            System.out.println("The Victory Phrase: "+this.gamningPlayer.getVictoryPhrase().toUpperCase());
        }

    }
}