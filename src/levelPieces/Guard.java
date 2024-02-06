package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/* Class: Guard
 * Purpose: used to create a guard gamepiece for the KerPlop Game
 * Responsibilities: Interacts with the player by killing the player if the player is within
 * one block of it. For each interaction either a kill occurs or no interaction
 * occurs. Also patrols near its starting square within the gameboard. This class 
 * overrides the interfaces and abstract classes it inherits
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/1/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class Guard extends GamePiece implements Moveable{
	private int orignLoc;
	private int dir;
	
	public Guard(int location) {
		super('R', "Guard - (wants to kill you)", location);
		orignLoc = location;
		dir = -1;
	}

	
	/*
	 * Moves the guard back and forth based on its last move 
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		gameBoard[super.getLocation()] = null;
		if(Math.abs(super.getLocation() - orignLoc) >= 2) {
			//if the guard has patrolled 2 from his square, switch directiom
			dir *= -1;
		}

		 
		
		super.setLocation(super.getLocation() + (1*dir));
		gameBoard[super.getLocation()] = this;
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(super.getLocation()-playerLocation) <= 1) {
			return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}

}
