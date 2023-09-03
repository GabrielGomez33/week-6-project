import java.util.List;

public interface CardPlayerInterface {
    void draw(int numOfCards, Deck deck);
    Card flip();
    void incrementScore(int byHowMuch);
    void decreaseScore(int byHowMuch);
    void describeHand();
    void describePlayer();
}