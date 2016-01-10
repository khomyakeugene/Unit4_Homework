package com.company.math;

/**
 * Created by Yevgen on 09.01.2016.
 */
public abstract class CalcIntegralByMonteCarloMethod {
    abstract public double function(double argument);

    public double integral(double startPoint, double finishPoint, int precision) {
        double result = 0.0;

        double currentPoint = startPoint;
        double length = (finishPoint - startPoint);
        double delta = length / (precision - 1);
        for (int i = 0; i < precision; i++) {
            result += function(currentPoint);
            currentPoint += delta;
        }

        return (result * (length / precision));
    }
}
