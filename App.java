/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;


public class App
{
	public static void main(String[] args) {
	   List<Player> playersList = new ArrayList<>();
	   Player player1 = new Player("Gabriel");
	   Player player2 = new Player("Gabriella");
	   playersList.add(player1);
	   playersList.add(player2);
       Deck gameDeck = new Deck();
       WarGame warGame = new WarGame(playersList, gameDeck);
       warGame.warGameInit(playersList, gameDeck);
	    
	}
}

