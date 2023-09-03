import java.util.List;
import java.util.ArrayList; // Import ArrayList if not already imported

public class Player implements CardPlayerInterface {
    private final String name;
    private int score;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>(); // Initialize the hand
    }

    @Override
    public void draw(int numOfCards, Deck deck) {
        for (int i = 0; i < numOfCards; i++) {
            hand.add(deck.dealCard());
        }
    }

    @Override
    public Card flip() {
        return hand.remove(0);
    }

    @Override
    public void incrementScore(int byHowMuch) {
        score += byHowMuch;
    }

    @Override
    public void decreaseScore(int byHowMuch) {
        score -= byHowMuch;
    }

    @Override
    public void describeHand() {
        
            System.out.println(hand.get(hand.size()-1).getCardDescription());
        
    }

    @Override
    public void describePlayer() {
        System.out.println(name);
    }
    
    public String getName(){
        return name;
    }
    
    public String getRank(){
        return hand.get(hand.size()-1).getRank();
    }
    
    public int getScore(){
        return score;
    }
}