package tests;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Archer;
import levelPieces.Door;

/* Class: TestMovingPieces
 * Purpose: used to test the movement of each MovingPiece
 * Responsibilities: Uses JUnit unit testing to ensure that each MovingPiece is correctly
 * moving within the bounds of the gameboard without going out of bounds or landing on an
 * occupied space. This class test two different types of movement operations
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/6/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class TestMovingPieces {

	//only need two for the rubric, but the goblin piece moves as well
	
	
	/* 
	 * Tests random motion, used by the Archer
	 */
	@Test
	public void testArcher() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		/* 
		 * Fill all spots on the board except 10, edge cases, and player location
		 * This lets the archer move to 0, 20, and 10 and leaves a spot for the player
		 * allowing us to test the edge cases of the array and ensure the archer doesn't
		 * land on any other pices or on the player and it doesn't go out of bounds 
		 */
		int playerLoc = 2; 
		for(int i = 1; i < GameEngine.BOARD_SIZE; i++) {
			if(i == playerLoc || i == playerLoc || i == 10 || i == GameEngine.BOARD_SIZE - 1) {
				continue;
			}
			//Add a door in almost every space to restrict archer movement 
			gameBoard[i] = new Door();
		}
		
		//Place the sniper in location 10
		Archer archer = new Archer('A', "archer", 10);
		gameBoard[10] = archer;
		
		//Keep track of which spaces the archer lands in to make sure every space is hit
		int count0 = 0;
		int count10 = 0;
		int count20 = 0;
		
		//Run move() many times and make sure the archer is never in a space other than
		//0, 10, and 20
		for(int i = 0; i < 100; i++) {
			archer.move(gameBoard, 2);
			int loc = archer.getLocation();
			
			//make sure the archer is in one of the 3 open spots
			if (loc != 0 && loc != 10 && loc != 20) {
				fail("Invaild Square -- Already Filled");
			}
			
			//update the counter 
			switch(loc) {
			case 0:
				count0++;
				break;
			case 10:
				count10++;
				break;
			case 20:
				count20++;
				break;
			}
		}
		
		//make sure every open square was hit at some point
		assert(count0 >= 1);
		assert(count10 >= 1);
		assert (count20 >= 1);
	}
	
	/*
	 * Tests motions for Guard piece 
	 */
	@Test
	public void testGuard() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		
	}

}
