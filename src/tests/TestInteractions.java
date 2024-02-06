package tests;

import org.junit.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;

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
	}
	
	/*
	 * Tests that the Guard hits the player (interaction) only when player is on same 
	 * location or 1 spot adjacent 
	 */
	@Test
	public void testGuardInteraction() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	}
	
	/* 
	 * Tests that the Magic Carpet advances to next level (interaction) only when the player
	 * is on the same location
	 */
	@Test 
	public void testMagicCarpet() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	}
	
	/*
	 * Test that the Thorn Bush hits the player (interaction) only when the player is on
	 * the same location 
	 */
	@Test 
	public void testThornBush() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	}
	
	/*
	 * Tests that the Treasure Chest gives a point to the player (interaction) only when the
	 * player is on the same location or adjacent 
	 */
	@Test 
	public void testTreasure() {
		//Create a gameboard for the test
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	}

	
	
	
}
