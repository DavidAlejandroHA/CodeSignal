package dad.codesignal.TheJourneyBegins_;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.TheJourneyBegins;



public class AddTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(3,tjb.add(1, 2));
	}
	
	@Test
	public void test2() {
		throw new RuntimeException("error");
	}
	
	@Test
	public void test3() {
		assertEquals(8,tjb.add(10, -2));
	}
}
