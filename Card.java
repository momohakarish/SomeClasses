package learning;

/**
 * This class represents a card.
 * @author Itay Slavin.
 * @version 28/12/2019
 */

public class Card 
{
	private int value;
	private String name;
	private String suit;
	
	/**
	 * The regular constructor.
	 * @param value , the number value of the card.
	 * @param suit , the suit of the card.
	 * @param name , the name of the card.
	 */
	public Card(int value,String suit,String name)
	{
		this.value = value;
		this.name = name;
		this.suit = suit;
	} //Card
	
	 /**
	  * The copy constructor.
	  * @param other , other Card object to be copy.
	  */
	public Card(Card other)
	{
		this.value = other.value;
		this.suit = other.suit;
		this.name = other.name;
	} //Card
	
	/**
	 * @return Returns the value of the card.
	 */
	public int getValue()
	{
		return this.value;
	} //getValue
	
	/**
	 * @return Returns the name of the card.
	 */
	public String getName()
	{
		return this.name;
	} //getName
	
	/**
	 * @return Returns the suit of the card.
	 */
	public String getSuit()
	{
		return this.suit;
	} //getSuit
	
	/**
	 * @param value , card value to be set.
	 */
	public void setValue(int value)
	{
		this.value = value;
	} //setValue
	
	/** 
	 * @param name , name String to be set.
	 */
	public void setName(String name)
	{
		this.name = name;
	} //setName
	
	/**
	 * @param suit , suit to be set.
	 */
	public void setSuit(String suit)
	{
		this.suit = suit;
	} //setSuit
	
	/**
	 * @return returns the card in string format of name,suit
	 */
	@Override
	public String toString()
	{
		return this.name + " , " + this.suit;
	} //toString
} //End of class Card.
