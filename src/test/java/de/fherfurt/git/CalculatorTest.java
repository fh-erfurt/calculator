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
	public double plus(double i, double j)
	{
		return i+j;
	}

	@Test
	public double minus(double i, double j) {

		return i-j;
	}

	@Test
	public double mal(double i, double j) {
		return i*j;
	}

	@Test
	public double geteilt(double i, double j)
	{
		if (j != 0)
		{
			return i/j;
		}
		else{
			return null;
		}
	}

}