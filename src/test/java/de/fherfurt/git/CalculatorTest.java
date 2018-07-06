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
	public void plus()
	{
		double i = 5, j = 10;
		assertTrue(calculator.plus(i,j) == 15);
	}

	@Test
	public void minus()
	{
		double i = 5, j = 10;
        assertTrue(calculator.minus(i,j) == -5);
	}

	@Test
	public void mal()
	{
		double i = 5, j = 10;
        assertTrue(calculator.mal(i,j) == 50);
	}

	@Test
	public void geteilt()
	{
		double i = 10, j = 5;
        assertTrue(calculator.geteilt(i,j) == 2);
	}


}