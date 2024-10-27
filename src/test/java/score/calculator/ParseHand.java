package score.calculator;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;


public class ParseHand {

    private final HandParser handParser = new HandParser();

    @Test
    void withStarterCardFiveOfClubs() {
        Hand hand = handParser.parse("5♥5♦5♠J♣5♣");
        assertAll(
                () -> assertEquals('5', Hand.starterCard(hand).rank()),
                () -> assertEquals('♣', Hand.starterCard(hand).suite())

        );
        }

}
