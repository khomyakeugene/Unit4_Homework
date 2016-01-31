package com.company.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class CircleTest {

    @Test
    public void testCalcArea() throws Exception {
        final Double radius = 10.0;
        final Circle circle= new Circle(radius);

        circle.calcArea();
        final Double result = circle.getArea();

        final Double expectedResult = 314.1592653589793;
        Assert.assertEquals(expectedResult, result);
    }
}