import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    
    public Deck(){
        initializeDeck();
    }
    
    private void initializeDeck() {
        cards = new ArrayList<>();
        
        String[] possibleSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] possibleRanks = {"2", "3","4","5","6","7","8","9","10", "Jack", "Queen", "King", "Ace"};
        
        for(int i=0; i<possibleSuits.length; i++){
            for(int i2=0; i2<possibleRanks.length; i2++){
                String currentSuit = possibleSuits[i];
                String currentRank = possibleRanks[i2];
                cards.add(new Card( currentRank, currentSuit));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card dealCard() {
        if(!cards.isEmpty()){
            return cards.remove(cards.size() - 1);
        }
        return null;
    }
    
    public int size() {
        return cards.size();
    }
}