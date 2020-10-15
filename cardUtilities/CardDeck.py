from random import shuffle
from cardUtilities.Card import Card


class CardDeck:

    MAX_CARD_VALUE = 10
    ACE_VALUE = 1

    def __init__(self):
        self.deck = []

    def __len__(self) -> int:
        return len(self.deck)

    def __repr__(self) -> str:
        return str(self.deck)

    def pop(self) -> Card:
        if len(self) == 0:
            raise IndexError('Tried to pop out of an empty deck')
        return self.deck.pop()

    def fill(self) -> None:
        names = ('Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine', 'Ten', 'Jack', 'Queen', 'King')
        suits = ('Clubs', 'Diamonds', 'Hearts', 'Spades')
        for value, name in enumerate(names):
            for suit in suits:
                self.deck.append(Card(min(value + 2, CardDeck.MAX_CARD_VALUE), suit, names[value]))
        # Adding the aces separately
        for suit in suits:
            self.deck.append(Card(CardDeck.ACE_VALUE, suit, 'Ace'))

    def shuffle(self) -> None:
        shuffle(self.deck)

    def is_empty(self) -> bool:
        return len(self) == 0

