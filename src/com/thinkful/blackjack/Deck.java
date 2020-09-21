package com.thinkful.blackjack;

public class Deck {
    public static final int DECK_SIZE = 52;

    private Card[] cards;

    public Deck() {
        this.setCards(new Card[DECK_SIZE]);
        int i = 0;
        for(Suit suit: Suit.values()){
            for(Face face: Face.values()) {
                this.getCards()[i] = new Card(face, suit);
                i = i + 1;
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Card c : this.getCards()) {
            sb.append(String.format("%s,", c));
        }
        if (this.getCards().length > 0) {
            sb.deleteCharAt(sb.length() - 1); //remove the extraneous comma
        }
        sb.append("]");
        return sb.toString();
    }
}
