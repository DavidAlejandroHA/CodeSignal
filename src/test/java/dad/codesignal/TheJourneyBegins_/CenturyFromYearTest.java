package dad.codesignal.TheJourneyBegins_;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.TheJourneyBegins;

public class CenturyFromYearTest {
	
private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(21, tjb.century(2001));
	}
	
	@Test
	public void test2() {
		assertEquals(19, tjb.century(1874));
	}
	
	@Test
	public void test3() {
		assertNotEquals(18, tjb.century(1874));
	}

}
