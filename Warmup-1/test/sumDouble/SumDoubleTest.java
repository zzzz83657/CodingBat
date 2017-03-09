package sumDouble;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumDoubleTest {

	SumDouble sum = new SumDouble();
	
	@Test
	public void testSumDouble() {
		assertTrue(sum.sumDouble(1,2) == 3);
		assertTrue(sum.sumDouble(3,2) == 5);
		assertTrue(sum.sumDouble(2,2) == 8);
	}

}
