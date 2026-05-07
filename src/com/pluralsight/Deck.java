package com.pluralsight;

import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;
    public Deck()
    {
        Suits[] suits = { Suits.Spades, Suits.Diamonds, Suits.Hearts, Suits.Clubs };
        String[] faces = { "Ace", "King", "Queens", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

        for (Suits suit: suits)
        {
            for (String face: faces)
            {
                cards.add(new Card(suit, face));
            }
        }
    }
}
