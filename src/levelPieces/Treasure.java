package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
/*
 * Class: Treasure
 * Purpose: Gives you a point when you are in the same square or next to it
 * Authors Gavin Garzia and Jacey Jonson
 */
public class Treasure extends GamePiece{

	public Treasure(int location) {
		super('X', "Treasure - (Get two to advance)", location);
	}

	//gives a point if you are on or near it
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(playerLocation - super.getLocation()) <= 1){
			return InteractionResult.GET_POINT;
		} 
		return InteractionResult.NONE;
	}

}
