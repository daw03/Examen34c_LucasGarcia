package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	
	RockPaperScissors p1 = new RockPaperScissors();

	@Test
	void CP1() {
		AssertEquals("Computer wins this round!",p1.checkGame("Felix","hola"));
	}
	
	@Test
	void CP2() {
		AssertEquals("It's a tie!",p1.checkGame("hola","hola"));
	}
	
	@Test
	void CP3() {
		AssertEquals("You win this round!",p1.checkGame("Rock","Scissors"));
	}

	@Test
	void CP4() {
		AssertEquals("Computer wins this round!",p1.checkGame("Rock","hola"));
	}

}
