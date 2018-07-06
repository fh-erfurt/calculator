package de.fherfurt.git;

public class Calculator {

    public int plus(int a, int b)
    {
        return a + b;
    }

    public int minus(int a, int b)
    {
        return a - b;
    }

    public int mal(int a, int b)
    {
        return a * b;
    }

    public int geteilt(int a, int b)
    {
        if (b == 0)
            b = 1;

        return a / b;
    }


}