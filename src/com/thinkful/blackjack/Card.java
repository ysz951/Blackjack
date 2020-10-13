package com.thinkful.blackjack;

public class Card {
    private Suit suit;
    private Face cardFace;
    private int value;
    private boolean turnedUp;
    public Card() {
        this(Face.ACE, Suit.SPADES, 1, false);
    }

    public Card(Face cardFace, Suit suit){
        this(cardFace, suit, cardFace.value, false);
    }

    public Card(Face cardFace, Suit suit, int value, boolean turnedUp){
        this.setSuit(suit);
        this.setCardFace(cardFace);
        this.setValue(value);
        this.setTurnedUp(turnedUp);
    }
    @Override
    public String toString() {
        return String.format("%s%s%s",
                this.getCardFace(), this.getSuit(), this.isTurnedUp()?"\u2191":"\u2193");
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Face getCardFace() {
        return cardFace;
    }

    public void setCardFace(Face cardFace) {
        this.cardFace = cardFace;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isTurnedUp() {
        return turnedUp;
    }

    public void setTurnedUp(boolean turnedUp) {
        this.turnedUp = turnedUp;
    }
}
