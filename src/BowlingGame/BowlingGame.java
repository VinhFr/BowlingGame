package BowlingGame;

public class BowlingGame {

	private int score = 0;
	
	void roll(int i) {	
		score += i ;
	}
	
	int score() {
		return score ;
	}
	
}
