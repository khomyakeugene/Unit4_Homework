package com.company.distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 01.02.2016 as a part of the project "Unit4_Homework".
 */
public class DistanceTest {
    public final Double x1 = 3.0;
    public final Double y1 = 5.3;
    public final Double x2 = 7.2;
    public final Double y2 = 1.1;

    @Test
    public void testCalcDistance() throws Exception {
        final Double result = Distance.calcDistance(new Point(x1, y1), new Point(x2, y2));

        final Double expectedResult = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        assertEquals(expectedResult, result);
    }
}