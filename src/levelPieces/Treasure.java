package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Treasure extends GamePiece{

	public Treasure(int location) {
		super('X', "Treasure - (Get two to advance)", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation==super.getLocation()) {
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}

}
