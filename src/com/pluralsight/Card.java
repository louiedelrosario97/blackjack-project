package com.pluralsight;

public class Card
{
    private Suits suit;
    private String faceValue;
    private boolean isDealt;


    public Card(Suits suit, String faceValue)
    {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getters
    public Suits getSuit() { return suit; }
    public String getFaceValue() { return faceValue; }

    // Derived Getters
    public String getColor()
    {
        return switch (suit)
        {
            case Suits.Hearts, Suits.Diamonds -> "Red";
            default -> "Black";
        };
    }

    public int getPointValue()
    {
        return switch (faceValue)
        {
            case "Ace" -> 11;
            case "Jack", "Queen", "King" -> 10;
            default -> Integer.parseInt(faceValue);
        };
    }
}

