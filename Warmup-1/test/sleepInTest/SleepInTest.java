package sleepInTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sleepIn.SleepIn;

public class SleepInTest {

	SleepIn sleep = new SleepIn();
	
	@Test
	public void testSleepIn1() {
		assertTrue(sleep.sleepIn(true, true));
		assertFalse(sleep.sleepIn(true, false));
		assertTrue(sleep.sleepIn(false, true));
		assertTrue(sleep.sleepIn(false, false));
	}
	@Test
	public void testSleepIn2() {
		assertTrue(sleep.sleepIn(true, true));
		assertFalse(sleep.sleepIn(true, false));
		assertTrue(sleep.sleepIn(false, true));
		assertTrue(sleep.sleepIn(false, false));
	}
}
