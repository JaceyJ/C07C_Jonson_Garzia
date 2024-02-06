package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/* Class: ThornBush
 * Purpose: used to create an thornbush gamepiece for the KerPlop Game
 * Responsibilities: Interacts with the player by hitting the player if they are on top of 
 * it. This class overrides the interfaces and abstract classes 
 * it inherits
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/1/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class ThornBush extends GamePiece{
	public ThornBush(int location) {
		super('T', "ThornBush (hits you if you are in the same space)", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
}
