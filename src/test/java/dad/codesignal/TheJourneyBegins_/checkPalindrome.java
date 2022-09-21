package dad.codesignal.TheJourneyBegins_;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.TheJourneyBegins;

public class checkPalindrome {
private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		String p1 = "papap";
		assertEquals(true,tjb.checkpalindromo(p1));
	}
	
	@Test
	public void test2() {
		String p2 = "hola";
		assertEquals(false,tjb.checkpalindromo(p2));
	}
	
	@Test
	public void test3() {
		String p3 = "holaloh";
		assertNotEquals(false,tjb.checkpalindromo(p3));
	}

}
