package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

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
