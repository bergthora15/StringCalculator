package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testThreeNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testMultipleNumbers() {
		assertEquals(250, Calculator.add("10,10,50,100,30,50"));
	}
	@Test
	public void testNewLinesBetweenNumbers() {
		assertEquals(3, Calculator.add("1\n2"));
	}
}

