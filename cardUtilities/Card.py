class Card:

    def __init__(self, value, suit, name):
        self.value = value
        self.suit = suit
        self.name = name

    def __repr__(self):
        return f'{self.name} of {self.suit}'


