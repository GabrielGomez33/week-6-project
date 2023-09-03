import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class WarGame{
    
    public WarGame(List<Player> players, Deck gameDeck){
        
    }

public void warGameInit(List<Player> players, Deck gameDeck) {
    int numOfPlayers = players.size();
    
    
    gameDeck.shuffle();
    
    for (int i = 1; i <= 26; i++) { // This loop runs 52 times
        for (int i2 = 0; i2 < numOfPlayers; i2++) { // This loop iterates through players
            String currentPlayer = players.get(i2).getName();
            System.out.println("Round " + i + ": " + currentPlayer + "'s turn");
            players.get(i2).draw(1, gameDeck);
            System.out.println(currentPlayer + " drew a card:");
            players.get(i2).describeHand();
            
        }
        Player whoWon = compareCards(players);
        whoWon.incrementScore(1);
        System.out.println(whoWon.getName() + ": is the winner of this round");
    }
    
    Player winner = compareScores(players);
    
    
}

public Player compareCards(List<Player> players){
    System.out.println("Comparing cards...");
    Map<String, Integer> rankNumberPairs = new HashMap<>();
    rankNumberPairs.put("2", 2);
    rankNumberPairs.put("3", 3);
    rankNumberPairs.put("4", 4);
    rankNumberPairs.put("5", 5);
    rankNumberPairs.put("6", 6);
    rankNumberPairs.put("7", 7);
    rankNumberPairs.put("8", 8);
    rankNumberPairs.put("9", 9);
    rankNumberPairs.put("10", 10);
    rankNumberPairs.put("Jack", 11);
    rankNumberPairs.put("Queen", 12);
    rankNumberPairs.put("King", 13);
    rankNumberPairs.put("Ace", 13);
    
    String whoWon = " ";
    int greatestValue = 0;
    Player winner = null;
    
    for(int i=0; i<players.size(); i++){
        String playerName = players.get(i).getName();
        String playerCardRank = players.get(i).flip().getRank();
        System.out.println(playerCardRank);
        
        if(rankNumberPairs.get(playerCardRank) > greatestValue){
            whoWon = playerName;
            greatestValue = rankNumberPairs.get(playerCardRank);
            winner = players.get(i);
        }
        
        
    }
    
    return winner;
    
}
public Player compareScores(List<Player> players){
    System.out.println("Retrieving final scores....");
    int highestScore = Integer.MIN_VALUE;
    Player winner = null;
    Boolean differentScores = false;
    for(int i=0; i<players.size(); i++){
        
        int playerScore = players.get(i).getScore();
        String playerName = players.get(i).getName();
        System.out.println(playerName + "'s FINAL SCORE: " + playerScore);
        if(playerScore > highestScore){
            highestScore = playerScore;
            winner = players.get(i);
            
        }else if (playerScore < highestScore) {
            differentScores = true;
        }
    
        
    }
    
    if (differentScores) {
        System.out.println("We have a WINNER!!!");
        System.out.println(winner.getName() + " is the winner with a score of: " + highestScore);
        System.out.println("Thank you for playing!");
    } else {
        System.out.println("No winner found. It's a tie!");
        System.out.println("Thank you for playing!");
        winner = null;
    }
    
    return winner;
}
}