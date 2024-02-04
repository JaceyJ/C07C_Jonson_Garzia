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
		//Level One Pieces: Door, Goblin, Guard, Treasure, Magic Carpet
		//Level Two Pieces: Door, Goblin, Archer, Thornbush, Treasure, Magic Carpet
		if(levelNum == 1) {
		
		//Add Door
		Door newDoor = new Door();
		board[19] = newDoor;
	
		//Add Goblin
		Goblin newGoblin = new Goblin('G', "Goblin", 5);
		movingPieces.add(newGoblin);
		board[newGoblin.getLocation()] = newGoblin;
		
		//Add Guard
		Guard newGuard = new Guard(15);
		movingPieces.add(newGuard);
		interactingPieces.add(newGuard);
		board[newGuard.getLocation()] = newGuard;
		
		//Add Treasure 
		Treasure newTreasure = new Treasure(14);
		interactingPieces.add(newTreasure);
		board[newTreasure.getLocation()] = newTreasure;
		
		//Add Magic Carpet
		MagicCarpet newMagicCarpet = new MagicCarpet('M', "Magic Carpet", 17);
		interactingPieces.add(newMagicCarpet);
		board[newMagicCarpet.getLocation()] = newMagicCarpet;
		
		} else if (levelNum  == 2) {
			//Add Door
			Door newDoor = new Door();
			board[2] = newDoor;
		
			//Add Goblin
			Goblin newGoblin = new Goblin('G', "Goblin", 10);
			movingPieces.add(newGoblin);
			board[newGoblin.getLocation()] = newGoblin;
			
			//Add Archer
			Archer newArcher = new Archer ('A', "Archer", 8);
			interactingPieces.add(newArcher);
			movingPieces.add(newArcher);
			board[newArcher.getLocation()] = newArcher;
			
			//Add Thornbush
			ThornBush newThornbush = new ThornBush(3);
			interactingPieces.add(newThornbush);
			board[newThornbush.getLocation()] = newThornbush;
			
			//Add Treasure 
			Treasure newTreasure = new Treasure(14);
			interactingPieces.add(newTreasure);
			board[newTreasure.getLocation()] = newTreasure;
			
			//Add Magic Carpet
			MagicCarpet newMagicCarpet = new MagicCarpet('M', "Magic Carpet", 18);
			interactingPieces.add(newMagicCarpet);
			board[newMagicCarpet.getLocation()] = newMagicCarpet;
			

		}
	}
}
