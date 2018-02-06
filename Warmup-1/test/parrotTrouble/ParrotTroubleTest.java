package parrotTrouble;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParrotTroubleTest {
	
	ParrotTrouble parrot = new ParrotTrouble();

	@Test
	public void testParrotTroubleTrue() {
		assertTrue(parrot.parrotTrouble(true, 6));
		assertTrue(parrot.parrotTrouble(true, 21));
	}
	@Test
	public void testParrotTroubleFalse() {
		assertFalse(parrot.parrotTrouble(false, 6));
		assertFalse(parrot.parrotTrouble(false, 7));
		assertFalse(parrot.parrotTrouble(true, 7));
		assertFalse(parrot.parrotTrouble(false, 8));
		assertFalse(parrot.parrotTrouble(true, 21));
	}

}
