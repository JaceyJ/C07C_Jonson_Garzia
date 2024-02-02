package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/*
 * Class: Guard
 * Purpose: patrols near its starting square and will kill you if you are within one square of it
 * Authors Gavin Garzia and Jacey Jonson
 */
public class Guard extends GamePiece implements Moveable{
	private boolean lastMoveLeft;
	public Guard(int location) {
		super('G', "Guard - (wants to kill you)", location);
		lastMoveLeft = false;
	}

	
	/*
	 * Moves the guard back and forth based on its last move 
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		if(lastMoveLeft && super.getLocation() < gameBoard.length && gameBoard[super.getLocation()+1] == null) {
			gameBoard[super.getLocation()+1] = this;
			gameBoard[super.getLocation()] = null;
			super.setLocation(super.getLocation()+1);
			
		}else if(!lastMoveLeft && super.getLocation() >= 0 && gameBoard[super.getLocation()-1] == null){
			gameBoard[super.getLocation()-1] = this;
			gameBoard[super.getLocation()] = null;
			super.setLocation(super.getLocation()+1);
		}
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(super.getLocation()-playerLocation) <= 1) {
			return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}

}
