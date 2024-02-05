package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/* Class: MagicCarpet 
 * Purpose: used to create a Magic Carpet gamepiece for the KerPlop Game
 * Responsibilities: Interacts with the player by allowing the player to win the game or
 * move to the next level if the player lands on top of it. This object does not move. This
 *  class overrides the interfaces and abstract classes it inherits
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/1/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class MagicCarpet extends GamePiece {

	public MagicCarpet(char symbol, String label, int location) {
		super(symbol, label, location);
	}

	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.ADVANCE; //advance level if player is on it
		}
		return InteractionResult.NONE;
	}
}
