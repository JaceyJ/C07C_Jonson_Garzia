package levelPieces;

import gameEngine.Drawable;

/* Class: Door
 * Purpose: used to create a door gamepiece for the KerPlop Game
 * Responsibilities: This gamepiece doesn't move or interact with the player -- it does
 * nothing
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/1/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class Door implements Drawable{
	private String label;
	private char symbol;
	
	public Door() {
		super();
		this.label = "Door (its not locked, you can open it)";
		this.symbol = 'D';
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
	
}
