package de.fherfurt.git;

public class Calculator {
    public double plus (double val1, double val2){
        return val1 + val2;
    }

    public double minus (double val1, double val2) {
        return val1 - val2;
    }

    public double mal (double val1, double val2) {
        return val1 * val2;
    }

    public double geteilt (double val1, double val2) {
        double res = 0;
        if (val2 != 0) {
            res = val1 / val2;
        }
        return res;
    }

}
