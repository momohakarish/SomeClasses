package cardDeck;

import java.util.Stack;
import java.util.Collections;

/**
 * This class represents a card deck.
 * @author Itay Paz Slavin
 * @version 13/3/2020
 */
public class CardDeck 
{
	//Attributes
	private Stack<Card> deck;
	private int size;
	
	//Constants
	private static final int DEFAULT_NUMBER_OF_CARDS_IN_DECK = 0;
	private static final int NORMAL_DECK_SIZE = 52;
	
	
	//Constructors
	/**
	 * Initializes an empty deck.
	 */
	public CardDeck()
	{
		this.deck = new Stack<Card>();	
		this.size = DEFAULT_NUMBER_OF_CARDS_IN_DECK;		
	}
	
	/**
	 * Fills the deck with the standard 52 cards.
	 */
	public void fill()
	{
		//Two arrays in order to help build the deck.
		String [] names = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		String [] suits = {"Clubs" , "Diamonds" , "Hearts" , "Spades"};
		for(int i = 0; i < names.length; i++)
			for(String j : suits)
			{
				//Conditions so the values would match blackjack rules with the Ace value being defaulted to 1.
				if(i == names.length-1)
					deck.add(new Card(1,j,names[i]));
				else if(i + 2 > 10)
					deck.add(new Card(10,j,names[i]));
				else
					deck.add(new Card(i+2,j,names[i]));
			} //Inner for
		this.size = NORMAL_DECK_SIZE;
	}
	
	/**
	 * Shuffles the deck.
	 */
	public void shuffle()
	{
		Collections.shuffle(deck); //Shuffles the deck so it's random	
	}
	
	/**
	 * Removes a card from the deck if possible and returns it.
	 * @return Returns a card from the top of the deck. If the deck is empty returns a default card. 
	 */
	public Card removeCard()
	{
		if(!deck.isEmpty())
		{
			size--;
			return deck.pop();
		}
		return new Card();
	}
	
	/**
	 * Adds a card to the top of the deck.
	 * @param other other card to be added to the deck.
	 */
	public void add(Card other)
	{
		deck.push(other);
		size++;
	}
	
	/**
	 * Returns the size of the deck (How many cards are currently in)
	 * @return number of cards currently in the deck.
	 */
	public int getSize()
	{
		return this.size;
	}
		
	@Override
	public String toString()
	{
		String str = "";
		for(Card i : deck)
			str += i.toString() + " ";
		return str;
	}

} //End of CardDeck
