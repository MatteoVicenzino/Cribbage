package score.calculator;

public class Card {

    public final Character rank;
    public final Character suite;

    public Card(Character rank, Character suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Character suite() {
        return suite;
    }

    public Character rank() {
        return rank;
    }
}
