public class Card implements CardInterface {
    
    private final String rank;
    private final String suit;
    
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    @Override
    public String getRank() {
        return rank;
    }
    
    @Override
    public String getSuit(){
        return suit;
    }
    
    @Override
    public String getCardDescription(){
        String cardDescription = rank + " of " + suit;
        return cardDescription;
    }
    
}