package com.tasks3.carddeck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;
    private ArrayList<Card> deckRemoved = new ArrayList<Card>();
    private int sizeDeck = 0;
    private int sizeDeckRemove = 0;

    public Deck() {
        this.createDeck();
    }

    public int sizeDeck() {
        return sizeDeck;
    }

    public int sizeDeckRemove() {
        return sizeDeckRemove;
    }

    @Override
    public String toString() {
        String s = "";
        for (Card c : deck) {
            s += c.getSuit().getName() + " "  + c.getRank().getName() + "\n";
        }
        return s;
    }

    //Наповнюємо колоду картами
    public void createDeck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                deck.add(new Card(Rank.values[j], Suit.values[i]));
                sizeDeck++;
            }
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        if (deck != null && sizeDeck() != 0) {
            Collections.shuffle(deck);
        } else {
            throw new NullPointerException();
        }
    }
    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        ArrayList<Card> deckTemp = new ArrayList<Card>();
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                deckTemp.add(new Card(Rank.values[j], Suit.values[i]));
            }
        }
        for (int i = 0; i < deckTemp.size(); i++) {
            for (int j = 0; j < sizeDeckRemove(); j++) {
                if (deckTemp.get(i).getSuit().getName().equals(deckRemoved.get(j).getSuit().getName())
                        && deckTemp.get(i).getRank().getName().equals(deckRemoved.get(j).getRank().getName())) {
                    deckTemp.remove(deckTemp.get(i));
                }
            }
        }
        deck = deckTemp;
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (sizeDeck() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext() == true) {
            Card removedCard = deck.get(sizeDeck() - 1);
            deckRemoved.add(removedCard);
            deck.remove(sizeDeck() - 1);
            sizeDeck--;
            sizeDeckRemove++;
            return removedCard;
        }
        return null;
    }
}
