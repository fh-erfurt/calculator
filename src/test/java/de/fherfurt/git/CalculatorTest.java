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
		assertEquals(4,calculator.plus(1,3));
	}
    
    @Test
	public void minus() {
		assertEquals(4,calculator.minus(5,1));

	}
    
    @Test
	public void mal() {
		assertEquals(6,calculator.mal(3,2));
	}
    
    @Test
	public void geteilt() {
		assertEquals(2,calculator.geteilt(6,3));
	}

}