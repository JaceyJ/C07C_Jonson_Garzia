package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Archer extends GamePiece implements Moveable {

	public Archer(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		//randomly shoots either left or right between 1-5 spaces -- player
		//is hit if shot;
		
		//determine the direction
		InteractionResult result = InteractionResult.NONE;
		int shootDir = 1; 
		int dir = (int) (Math.random()); //random number between 0-1
		if (dir == 0) {
			//switch the direction
			shootDir *= -1;
		} 
		
		int arrLoc = super.getLocation();
		int length = (int) (Math.random() * 5) + 1;
		for(int i = 0; i < length; i++) {
			if(arrLoc + (1 * shootDir) < 0 || arrLoc + (1 * shootDir) >= gameBoard.length) {
				break;
			} 
			arrLoc += 1 * shootDir;
			if (arrLoc == playerLocation) {
				result = InteractionResult.HIT;
				break;
			}
			
		}
		return result;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		gameBoard[super.getLocation()] = null;
		// moves to a random location within the bounds of the board 
		int randomLoc = 0;
		while(true) {
			//random number between 0-20
			randomLoc = (int) (Math.random() * gameBoard.length);
			if(gameBoard[randomLoc] == null) {
				System.out.println("HERE");
				break;
			}
		}
			super.setLocation(randomLoc);
			gameBoard[super.getLocation()] = this;
	}

}
