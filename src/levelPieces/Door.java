package levelPieces;

import gameEngine.Drawable;

/*
 * Class: Door
 * Purpose: draws a door on the game board. Door does nothing.
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
		System.out.println(symbol);
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
	
}
