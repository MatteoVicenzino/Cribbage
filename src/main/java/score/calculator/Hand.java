package score.calculator;

public class Hand {

    public static Character starterCardRank;
    public static Character starterCardSuite;

    public Hand(String handAsString) {
        this.starterCardRank = handAsString.charAt(8);
        this.starterCardSuite = handAsString.charAt(9);
    }

    public String handCards() {
        return null;
    }

    public static Card starterCard(Hand hand) {
        return new Card(starterCardRank, starterCardSuite);
    }
}
