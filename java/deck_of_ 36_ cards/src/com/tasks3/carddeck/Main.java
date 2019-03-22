package com.tasks3.carddeck;

public class Main {
    public static void main(String[] args) {
        Deck deck1 = new Deck();

/*        System.out.println(deck1.toString());
        System.out.println(deck1.sizeDeck());

        System.out.println(deck1.drawOne().toString());
        System.out.println(deck1.sizeDeck());

        System.out.println(deck1.drawOne().toString());
        System.out.println(deck1.sizeDeck());
        System.out.println(deck1.toString());*/

        deck1.shuffle();
        System.out.println(deck1.toString());
        System.out.println(deck1.sizeDeck());

        System.out.println(deck1.drawOne().toString());
        System.out.println(deck1.sizeDeck());

        deck1.order();
        System.out.println(deck1.toString());
        System.out.println(deck1.sizeDeck());
    }
}
