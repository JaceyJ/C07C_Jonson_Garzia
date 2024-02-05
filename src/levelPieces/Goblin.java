package levelPieces;

import gameEngine.Drawable;

import gameEngine.InteractionResult;
import gameEngine.Moveable;


/* Class: Goblin
 * Purpose: used to create a goblin gamepiece for the KerPlop Game
 * Responsibilities: This piece does not interact with the player. The goblin will move from
 * right to left across the board, jumping two spaces at a time and checking bounds to ensure
 * it doesn't go out of bounds. This class overrides the interfaces
 * and abstract classes it inherits
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/1/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class Goblin extends GamePiece implements Moveable {

	private int dir; 
	
	public Goblin(char symbol, String label, int location) {
		super(symbol, label, location);
		dir = 1; //starts the goblin moving left
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		return InteractionResult.NONE;
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		gameBoard[super.getLocation()] = null;
		//moves left, jumping over pieces until at end of board and 
		//never jumps less than 2 spots at a time 
		int curLocation = super.getLocation() + (1 * dir);
		
		//try to move the piece a direction --> keep moving until open space
		while(true) {
			if(curLocation + 1  > gameBoard.length - 1 || curLocation - 1 < 0) {
				dir *= -1;
			} 
			//move once 
			curLocation += 1 * dir;
			//check spot 
			if(gameBoard[curLocation] == null) {
				break;
			}
		}
		super.setLocation(curLocation);
		gameBoard[super.getLocation()] = this;
		
	}
	
	public void draw() {
		super.draw();
	}
	
	
}
