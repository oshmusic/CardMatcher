package app.cardmatcher.model;
/**
 * A class to represent Card objects
 */
public class Card {
    private String value; //the value of the card
    private int cardID;

    public Card(String value){
        this.value = value;
    }

    public int getCardID() {
        return cardID;
    }

    public String getValue(){
        return this.value;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }
}
