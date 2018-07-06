package de.fherfurt.git;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
	public void testPlus() {
    	assertEquals(3, calculator.plus(2,1));
	}
    
    @Test
	public void testMinus() {
		assertEquals(1, calculator.minus(2,1));
	}
    
    @Test
	public void testMultiply() {
		assertEquals(2, calculator.multiply(2,1));
	}
    
    @Test
	public void testDivide() {
		assertEquals(2, calculator.divide(2,1));
	}

}