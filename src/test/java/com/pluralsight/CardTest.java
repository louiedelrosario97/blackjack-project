package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CardTest
{
    @Test
    public void getColor_shouldReturnColor()
    {
        // arrange
        Card card = new Card(Suits.Spades, "Q");
        String expected = "Black";

        // act
        String actual = card.getColor();

        // assert
        assertEquals(expected, actual, "because I created a Queen of Spades");
    }

    @Test
    public void getPointValue_shouldReturnCorrectValue()
    {
        // arrange
        HashMap<Card, Integer> cards = new HashMap<>();
        cards.put(new Card(Suits.Spades, "Queen"), 10);
        cards.put(new Card(Suits.Spades, "King"), 10);
        cards.put(new Card(Suits.Spades, "Jack"), 10);
        cards.put(new Card(Suits.Spades, "Ace"), 11);
        cards.put(new Card(Suits.Spades, "5"), 5);


        for(Map.Entry<Card, Integer> row : cards.entrySet())
        {
            // act
            Card card = row.getKey();
            int actual = row.getKey().getPointValue();

            // assert
            assertEquals(row.getValue(), actual, "Because the card is a " + card.getFaceValue() + " of " + card.getSuit());
        }

    }
}