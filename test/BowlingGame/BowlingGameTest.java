package BowlingGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BowlingGameTest {
	private BowlingGame game;

	@BeforeEach
	void setUp() {
		game = new BowlingGame();
	}
	
	@Test
	void testRoll() {
		game.roll(0);
	}

	@Test
	void testScore() {
		game.roll(0);
		assertEquals(game.score(),0);
	}

	@Test
	void testScore0TousFrames(){
		int pinsdown = 0;
		rolls(20,pinsdown);
		assertEquals(game.score(),0);
	}
	
	@Test
	void testScore1TousFrames() {
		int pinsdown = 1;
		rolls(20,pinsdown);
		assertEquals(game.score(),20);
	}
	
	void rolls(int times,int pinsdown) {
		for (int i = 0 ; i < times ; i++) {
			game.roll(pinsdown);
		}
	}
}
