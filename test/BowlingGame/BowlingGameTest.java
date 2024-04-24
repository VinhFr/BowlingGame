package BowlingGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BowlingGameTest {
	BowlingGame game;

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
		for (int i = 0 ; i < 20 ; i++) {
			game.roll(0);
		}
		assertEquals(game.score(),0);
	}
	
}
