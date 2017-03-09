package diff21;

import static org.junit.Assert.*;

import org.junit.Test;

public class Diff21Test {

	Diff21 diff = new Diff21();
	
	@Test
	public void testDiff21() {
		assertTrue(diff.diff21(19) == 2);
		assertTrue(diff.diff21(10) == 11);
		assertTrue(diff.diff21(21) == 0);
		assertTrue(diff.diff21(-19) == 2);
		assertTrue(diff.diff21(-10) == 11);
		assertTrue(diff.diff21(-21) == 0);
		assertTrue(diff.diff21(34) == 26);
		assertTrue(diff.diff21(-34) == 26);
		assertTrue(diff.diff21(22) == 2);
		assertTrue(diff.diff21(-22) == 2);
	}

}
