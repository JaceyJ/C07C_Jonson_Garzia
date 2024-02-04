package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class MagicCarpet extends RandomMotionPiece {

	public MagicCarpet(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}
}
