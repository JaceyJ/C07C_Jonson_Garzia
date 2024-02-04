package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Goblin extends GamePiece implements Moveable {
//Replicates Minion Class
	int dir; 
	
	public Goblin(char symbol, String label, int location) {
		super(symbol, label, location);
		dir = -1; //starts the goblin moving left
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		//moves left, jumping over pieces until at end of board and 
		
		//never jumps less than 2 spots at a time 
		int curLocation = super.getLocation() + (1 * dir);
		//try to move the piece a direction --> keep moving until open space
		while(true) {
			if(curLocation > gameBoard.length || curLocation < 0) {
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
	}
	
}
