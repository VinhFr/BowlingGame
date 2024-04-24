package BowlingGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingGameTest {
	BowlingGame game;

	@Test
	void testRoll() {
		BowlingGame game = new BowlingGame();
		game.roll(0);
	}

	@Test
	void testScore() {
		BowlingGame game = new BowlingGame();
		game.roll(0);
		assertEquals(game.score(),0);
	}

}
