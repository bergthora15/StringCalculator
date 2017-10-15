package is.ru.stringcalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

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
	@Test 
	public void testNewLinesAndCommas() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	@Test 
	public void testNegativeNumbers() throws Exception {
		try {
        	assertEquals(1, Calculator.add("-1,2"));
     	} catch(Exception e) {
    	String messages = "Negatives not allowed: -1";
        assertEquals(messages, e.getMessage());
		}
	}
	@Test
	public void testNumberHigherThen1000() {
		assertEquals(5, Calculator.add("1001,2,3"));
	}
	@Test
	public void testDifferentDelimeter() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}
}
	//@Rule
	//public ExpectedException thrown = ExpectedException.none();
	
	//@Test
	//public void testNegativeNumbers() {
	//	thrown.expect(RuntimeException.class);
 	//	thrown.expectMessage("Negatives not allowed: -1");

 	//	Calculator.add(-1,2);

	//}


