package sdm.running.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Score {

    @Test
    void oneForTheNobs() {
        CribbageHand hand = new CribbageHand(
                Arrays.asList(
                        new Card('8', '♥'),
                        new Card('J', '♣'),
                        new Card('6', '♠'),
                        new Card('K', '♣')
                ),
                new Card('3', '♣')
        );
        assertEquals(1, hand.score());
    }

    @Test
    void zero() {
        CribbageHand hand = new CribbageHand(
                Arrays.asList(
                        new Card('8', '♥'),
                        new Card('K', '♥'),
                        new Card('J', '♠'),
                        new Card('A', '♣')
                ),
                new Card('3', '♣')
        );
        assertEquals(0, hand.score());
    }
}