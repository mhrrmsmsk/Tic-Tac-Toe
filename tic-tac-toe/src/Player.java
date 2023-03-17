public class Player {
   private String userName;
   private String victoryPhrase;
   private String playerSymbol;
public int score;

    public Player(String userName,String victoryPhrase) {
        this.userName = userName;
        this.victoryPhrase= victoryPhrase;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVictoryPhrase() {
        return victoryPhrase;
    }

    public void setVictoryPhrase(String victoryPhrase) {
        this.victoryPhrase = victoryPhrase;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
}
