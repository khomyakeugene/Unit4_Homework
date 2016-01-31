package com.company.figure;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class CircleTest {
    public static final Double TEST_CIRCLE_RADIUS = 10.0;
    private static Circle circle;

    @BeforeClass
    public static void setUpClass() throws Exception {
        circle = new Circle(TEST_CIRCLE_RADIUS);
    }

    @Test
    public void testCalcArea() throws Exception {
        circle.calcArea();
        final Double result = circle.getArea();

        final Double expectedResult = Math.PI * TEST_CIRCLE_RADIUS * TEST_CIRCLE_RADIUS;
        assertEquals(expectedResult, result);
    }
}