# This is the class which will represent a playing card for our black jack game
# Author:           Itay Paz Slavin
# Date:             17/06/2020
# Version:          Python 3.18.0


class Card:

    def __init__(self, value, suit, name):
        self.value = value
        self.suit = suit
        self.name = name

    def __repr__(self):
        return f'{self.name} of {self.suit}'


