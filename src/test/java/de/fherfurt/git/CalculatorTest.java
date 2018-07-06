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
        assertEquals(calculator.plus(4,2), 6);
	}
    
    @Test
	public void minus()
	{ assertEquals(calculator.minus(4,2), 2); }
    
    @Test
	public void mal() {
        assertEquals(calculator.mal(4,2), 8);
	}
    
    @Test
	public void geteilt() {
        assertEquals(calculator.geteilt(4,2), 2);
	}

}