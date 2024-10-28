package score.calculator;

public class Hand {

    public static Character starterCardRank;
    public static Character starterCardSuite;

    public Hand(Character starterCardRank, Character starterCardSuite) {
        this.starterCardRank = starterCardRank;
        this.starterCardSuite = starterCardSuite;
    }

    public String handCards() {
        return null;
    }

    public static Card starterCard(Hand hand) {
        return new Card(starterCardRank, starterCardSuite);
    }
}
