package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args) {
        // try the no-argument constructor
        Card aceSpades = new Card();
        System.out.println(aceSpades);

        // Try the 2 argument constructor
        Card sevenSpades = new Card("7", "Spades");
        Card jackClubs = new Card("Jack", "Clubs");

        System.out.println(sevenSpades);
        System.out.println(jackClubs);

        // try the 4 argument constructor
        Card eightHearts = new Card("8", "Hearts", 8, false);
        Card tenClubs = new Card("10", "Clubs", 10, true);
        System.out.println(eightHearts);
        System.out.println(tenClubs);

    }

}
