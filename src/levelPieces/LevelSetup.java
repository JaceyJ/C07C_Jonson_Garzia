package levelPieces;

import java.util.ArrayList;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

/*
 * Class: LevelSetup
 * Purpose: set up board and create lists of moving pieces and intereacting pieces
 * Authors: Jacey Jonson and Gavin Garzias
 */
public class LevelSetup {
	private int playerStartLoc;
	private Drawable[] board;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int levelNum;
	
	
	public int getPlayerStartLoc() {
		return playerStartLoc;
	}
	public Drawable[] getBoard() {
		return board;
	}
	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}
	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}
	public LevelSetup() {
		super();
		this.board = new Drawable[GameEngine.BOARD_SIZE];
		this.movingPieces = new ArrayList<>();
		this.interactingPieces = new ArrayList<>();
		playerStartLoc = 0;
	}
	
	public void createLevel(int levelNum) {
		//TODO add level setups
		if(levelNum == 1) {
			
		}else if(levelNum == 2) {
			
		}
	}
}
