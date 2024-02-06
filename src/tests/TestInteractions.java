package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Archer;
import levelPieces.Guard;
import levelPieces.MagicCarpet;
import levelPieces.ThornBush;
import levelPieces.Treasure;

/* Class: TestInteractions
 * Purpose: used to test the interactions with each InteractingPiece with the player
 * Responsibilities: Uses JUnit unit testing to ensure that each InteractingPiece is 
 * correctly interacting with the player by ensuring interaction only happens within the 
 * defined bounds in each of the InteractingPieces classes
 * Authors: Jacey Jonson and Gavin Garzia
 * Date: 2/6/24
 * Collaborators: n/a
 * Sources: n/a
 */
public class TestInteractions {
	
	/* 
	 * Tests that the Archer hits the player (interaction) when the player is in range
	 * and in the correct direction 
	 */
	@Test 
	public void testArcherInteraction() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Archer archer = new Archer('A', "Archer", 0);
		/*
		 * The interaction for the archer involves randomization of the direction and 
		 * range of the arrow the archer shoots so to test many iterations of interaction
		 * will be run 
		 */
		
		//Test for hits with the player 1-5 spaces (within random range) of the archer
		for(int i = 1; i <= 5; i++) {
			boolean hit = false;
			//archer's range and direction is random, so must check for a hit many times
			for(int j = 0; j < 100; j++) {
				//note if over the 100 trials the player was hit at the range
				if(archer.interact(gameBoard, i) == InteractionResult.HIT) {
					hit = true;
					break;
				}
			}
			assert(hit);
		}
		//Test for hits with the player more than 5 spaces of the archer
				for(int i = 6; i < GameEngine.BOARD_SIZE; i++) {
					boolean hit = false;
					//archer's range and direction is random, so must check for a hit many times
					for(int j = 0; j < 100; j++) {
						//note if over the 100 trials the player was hit at the range
						if(archer.interact(gameBoard, i) == InteractionResult.HIT) {
							hit = true;
							break;
						}
					}
					assert(!hit);
				}
	}
	
	/*
	 * Tests that the Guard kills the player (interaction) only when player is on same 
	 * location or 1 spot adjacent 
	 */
	@Test
	public void testGuardInteraction() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Guard guard = new Guard(10);
		gameBoard[10] = guard;
				
		/* Need to check to make sure there is no interaction between player and the treasure
		* except at spots 9, 10, and 11
		* Using a for loop to test each spot to make sure the correct interaction occurs
		*/
		for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			if(i == 9 || i == 10 || i == 11) {
				assertEquals(guard.interact(gameBoard, i), InteractionResult.KILL);
			} else {
				assertEquals(guard.interact(gameBoard, i), InteractionResult.NONE);
			}
		}
	}
	
	/* 
	 * Tests that the Magic Carpet advances to next level (interaction) only when the player
	 * is on the same location
	 */
	@Test 
	public void testMagicCarpet() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		MagicCarpet magicCarpet = new MagicCarpet('M', "Magic Carpet", 10);
		gameBoard[10] = magicCarpet;
				
		/* Need to check to make sure there is no interaction between player and the treasure
		* except at spots 9, 10, and 11
		* Using a for loop to test each spot to make sure the correct interaction occurs
		*/
		for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			if(i == 10) {
				assertEquals(magicCarpet.interact(gameBoard, i), InteractionResult.ADVANCE);
			} else {
				assertEquals(magicCarpet.interact(gameBoard, i), InteractionResult.NONE);
			}
		}
	}
	
	/*
	 * Test that the Thorn Bush hits the player (interaction) only when the player is on
	 * the same location 
	 */
	@Test 
	public void testThornBush() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		ThornBush thornBush = new ThornBush(10);
		gameBoard[10] = thornBush;
				
		/* Need to check to make sure there is no interaction between player and the treasure
		* except at spot 10
		* Using a for loop to test each spot to make sure the correct interaction occurs
		*/
		for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			if(i == 10) {
				assertEquals(thornBush.interact(gameBoard, i), InteractionResult.HIT);
			} else {
				assertEquals(thornBush.interact(gameBoard, i), InteractionResult.NONE);
			}
		}
	}
	
	/*
	 * Tests that the Treasure Chest gives a point to the player (interaction) only when the
	 * player is on the same location or adjacent 
	 */
	@Test 
	public void testTreasure() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Treasure treasure = new Treasure(10);
		gameBoard[10] = treasure;
		
		/* Need to check to make sure there is no interaction between player and the treasure
		 * except at spots 9, 10, and 11
		 * Using a for loop to test each spot to make sure the correct interaction occurs
		 */
		for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			if(i == 9 || i == 10 || i == 11) {
				assertEquals(treasure.interact(gameBoard, i), InteractionResult.GET_POINT);
			} else {
				assertEquals(treasure.interact(gameBoard, i), InteractionResult.NONE);
			}
		}
	}

	
	
	
}
