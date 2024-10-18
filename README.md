# CRIBBAGE PROJECT 
members: Alessio Martucci, Margherita Necchi, Matteo Vicenzino

We want to write a Java program that computes the score of a Cribbage hand consisting of four hand cards and a starter card.

A Cribbage hand will be represented as a string of ten characters.
The first eight characters will represent the four hand cards. The last two characters will represent the starter card.

The scoring process will follow the following rules: 

    -2 points: each separate combination of two or more cards totalling exactly 15.
    
    -3 points: a run of 3 consecutive cards (regardless of suit).
    
    -4 points: a run of 4.
    
    -5 points: a run of 5.
    
    -2 points: 2 cards of a kind.
    
    -6 points: 3 cards of a kind (known as a "pair royal", comprising three distinct pairs).
    
    -12 points: 4 cards of a kind (a "double pair royal", comprising six distinct pairs).
    
    -4 points: a flush where all 4 cards in the hand are of the same suit, with an additional point if the starter card is also of that suit.
    
    -1 point: holding the Jack of the same suit as the starter card.
