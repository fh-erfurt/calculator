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
    	assertEquals(3, calculator.plus(2, 1));
	}
    
    @Test
	public void minus() {
    	assertEquals(3, calculator.minus(5, 2));
	}
    
    @Test
	public void mal() {
    	assertEquals(2, calculator.mal(2, 1));
	}
    
    @Test
	public void geteilt() {
    	assertEquals(2, calculator.geteilt(2, 1));
	}

}