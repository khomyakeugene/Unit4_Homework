package com.company.math;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class CalcIntegralByMonteCarloMethodTest {
    static final String MATH_CLASS_NAME = "java.lang.Math";
    static final String methodName = "sqrt";
    double startPoint = 1.0;
    double finishPoint = 10.0;
    int precision = 100;
    private static CalcIntegralByMonteCarloMethod calcIntegralByMonteCarloMethod;

    @BeforeClass
    public static void setUpClass() throws Exception {
        calcIntegralByMonteCarloMethod = new CalcIntegralByMonteCarloMethod(MATH_CLASS_NAME, methodName);
    }

    @Test (timeout = 1000)
    public void testCalcIntegral() throws Exception {
        Double result = calcIntegralByMonteCarloMethod.calcIntegral(startPoint, finishPoint, precision);

        final Double expected = 20.31765116729242;
        assertEquals(expected, result);
    }
}