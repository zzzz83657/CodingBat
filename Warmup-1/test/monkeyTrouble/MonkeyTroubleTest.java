package monkeyTrouble;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonkeyTroubleTest {

	MonkeyTrouble monkey = new MonkeyTrouble();
	
	@Test
	public void testMonkeyTrouble() {
		assertTrue(monkey.monkeyTrouble(true, true));
		assertTrue(monkey.monkeyTrouble(false, false));
		assertFalse(monkey.monkeyTrouble(true, false));
		assertFalse(monkey.monkeyTrouble(false, true));
	}

}
