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
	public void minus() {
		fail("Not yet implemented");
	}
    
    @Test
	public void mal() {
		fail("Not yet implemented");
	}
    
    @Test
	public void geteilt() {
		fail("Not yet implemented");
	}

}