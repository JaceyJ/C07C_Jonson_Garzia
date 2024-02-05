package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
/* Class: Treasure
 * Purpose: used to create an treasure gamepiece for the KerPlop Game
 * Responsibilities: Interacts with the player by giving the player a point if they are
 * within a block or on top of it. This object does not move. This class overrides the 
 * interfaces and abstract classes it inherits
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/1/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class Treasure extends GamePiece{

	public Treasure(int location) {
		super('X', "Treasure - (Get two to advance)", location);
	}

	//gives a point if you are on or near it
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(playerLocation - super.getLocation()) <= 1){
			return InteractionResult.GET_POINT; //give a point if within one space
		} 
		return InteractionResult.NONE;
	}

}
