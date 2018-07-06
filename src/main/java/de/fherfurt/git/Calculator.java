package de.fherfurt.git;

public class Calculator {

    private Calculator calculator;

    public void setUp() {
        calculator = new Calculator();
    }


    public double plus(double i, double j)
    {
        return i+j;
    }


    public double minus(double i, double j) {

        return i-j;
    }

    public double mal(double i, double j) {
        return i*j;
    }


    public double geteilt(double i, double j)
    {
        if (j != 0)
        {
            return i/j;
        }
        else{
            return 0;
        }
    }

}