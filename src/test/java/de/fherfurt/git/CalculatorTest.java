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
	public void plus() {
		assertEquals(4, calculator.plus(2, 2));
	}
    
    @Test
	public void minus() {
		assertEquals(-5, calculator.minus(3, 8));
	}
    
    @Test
	public void mal() {
		assertEquals(10, calculator.mal(5, 2));
	}
    
    @Test
	public void geteilt() {
		assertEquals(6, calculator.geteilt(12, 2));
	}

}