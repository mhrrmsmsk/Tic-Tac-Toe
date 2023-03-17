import java.util.Arrays;

public class GameBoard {
    public GameBoardSquare gameBoardSquare;
    public String[][] board={{"-","-","-"},{"-","-","-"},{"-","-","-"}};
   public void initGame(){
this.draw();
    }
public boolean checkGameFinished(){
       String line1 = board[0][0] + board[0][1]+ board[0][2];
    String line2 = board[1][0] + board[1][1]+ board[1][2];
    String line3 = board[2][0] + board[2][1]+ board[2][2];
    String line4 = board[0][0] + board[1][0]+ board[2][0];
    String line5 = board[0][1] + board[1][1]+ board[2][1];
    String line6 = board[0][2] + board[1][2]+ board[2][2];
    String line7 = board[0][0] + board[1][1]+ board[2][2];
    String line8 = board[2][0] + board[1][1]+ board[0][2];
    if (line1.equals("XXX")|| line2.equals("XXX")|| line3.equals("XXX")|| line4.equals("XXX")|| line5.equals("XXX")|| line6.equals("XXX")|| line7.equals("XXX")|| line8.equals("XXX")) {
return true;
    } else if (line1.equals("OOO")|| line2.equals("OOO")|| line3.equals("OOO")|| line4.equals("OOO")|| line5.equals("OOO")|| line6.equals("OOO")|| line7.equals("OOO")|| line8.equals("OOO")) {
        return true;
    }
    return false;
}
public void draw(){
    System.out.println("    "+"1  2  3");
    System.out.println("  "+"-----------");
    System.out.println("1"+" "+"|"+" "+board[0][0]+"  "+board[0][1]+"  "+board[0][2]);
    System.out.println("2"+" "+"|"+" "+board[1][0]+"  "+board[1][1]+"  "+board[1][2]);
    System.out.println("3"+" "+"|"+" "+board[2][0]+"  "+board[2][1]+"  "+board[2][2]);
}
}
