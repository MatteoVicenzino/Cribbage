
♣♦♥♠

### Behaviours

- Print the score on stdout
- Compute score
  - identify hand from starter card
  - retrieve rank and suite of a card
  - combine cards
- Analyse input string to extract cards
  - rank corresponds to numeric value
  - distinguish right suite

### Tests

- "5♥5♦5♠J♣5♣" -> 29 (all rules)
- "0♦J♥Q♠A♣9♦" -> 4 (run of four)
- first compute score for given hand only, without input and output
- "5♥5♦5♠J♣5♣" -> 5♣ is starter card
- "5♥5♦5♠J♣5♣" -> 5♥5♦5♠J♣ are hand card
- ~~"5♥" -> rank 5, suite hearts~~
- ~~"J♣" -> rank Jack, suite clubs~~
- ~~"5♥" -> suite Hearts~~
- ~~"5♠" -> suite Spades~~
- ~~"5♣" -> suite Clubs~~
- ~~"5♦" -> suite Diamonds~~

