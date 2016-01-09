package com.company.math;

/**
 * Created by Yevgen on 09.01.2016.
 */
public abstract class CalcIntegralByMonteCarloMethod {
    abstract protected Double function(Double argument);

    public Double integral(Double startPoint, Double finishPoint, int precision) {
        Double result = 0.0;

        Double currentPoint = startPoint;
        Double length = (finishPoint - startPoint);
        Double delta = length / (precision - 1);
        for (int i = 0; i < precision; i++) {
            result += function(currentPoint);
            currentPoint += delta;
        }

        return (result * (length / precision));
    }
}
