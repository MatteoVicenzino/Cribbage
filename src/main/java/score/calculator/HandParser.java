package score.calculator;

public class HandParser {

    public Hand parse(String handAsString) {
        Character starterCardRank = handAsString.charAt(8);
        Character starterCardSuite = handAsString.charAt(9);
        return new Hand(starterCardRank, starterCardSuite);
    }
}

