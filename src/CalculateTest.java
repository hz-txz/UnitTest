import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void testAdd() {
		Calculate.add(3);
        Calculate.add(4);
        assertEquals(7, Calculate.getResult());

	}

	@Test
	public void testSubstract() {
		Calculate.add(7);
		Calculate.substract(3);
        assertEquals(4, Calculate.getResult());
	}

	@Test
	public void testMultiply() {
		Calculate.add(8);
		Calculate.multiply(4);
        assertEquals(32, Calculate.getResult());
	}

	@Test
	public void testDivide() {
		Calculate.add(8);
		Calculate.divide(2);
        assertEquals(4, Calculate.getResult());
	}

	@Test
	public void testSquare() {
		Calculate.add(8);
		Calculate.square(2);
        assertEquals(64, Calculate.getResult());
	}

	@Test
	public void testSquareRoot() {
		Calculate.add(16);
		Calculate.squareRoot(2);
        assertEquals(4, Calculate.getResult());
	}

	@Test
	public void testClear() {
		Calculate.clear();
		assertEquals(0, Calculate.getResult());
	}

	@Test
	public void testGetResult() {
		Calculate.getResult();
		assertEquals(0, Calculate.getResult());
		
	}

}
