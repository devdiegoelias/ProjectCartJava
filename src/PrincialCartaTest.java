import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincialCartaTest {

	@Test
	void validLetterA() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("A"), 1);
	}
	
	@Test
	void validLettera() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("a"), 1);
	}
	
	@Test
	void validLetter2() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("2"), 2);
	}
	
	@Test
	void validLetter3() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("3"), 3);
	}
	
	@Test
	void validLetter4() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("4"), 4);
	}
	
	@Test
	void validLetter5() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("5"), 5);
	}
	
	@Test
	void validLetter6() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("6"), 6);
	}
	
	@Test
	void validLetter7() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("7"), 7);
	}
	
	@Test
	void validLetter8() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("8"), 8);
	}
	
	@Test
	void validLetter9() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("9"), 9);
	}
	
	@Test
	void validLetter10() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("10"), 10);
	}
	
	@Test
	void validLetterJ() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("J"), 11);
	}
	
	@Test
	void validLetterj() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("j"), 11);
	}
	
	@Test
	void validLetterQ() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("Q"), 12);
	}
	
	@Test
	void validLetterq() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("q"), 12);
	}
	
	@Test
	void validLetterK() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("K"), 13);
	}
	
	@Test
	void validLetterk() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("k"), 13);
	}

	@Test
	void validLetterg() {
		ValidLetter letter = new ValidLetter();
		assertEquals(letter.converteCartaParaInt("g"), 13);
	}
}
