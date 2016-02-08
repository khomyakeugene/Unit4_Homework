package com.company.figure;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class CircleTest {
    static final Double radius = 10.0;
    private static Circle circle;

    @BeforeClass
    public static void setUpClass() throws Exception {
        circle = new Circle(radius);
    }

    @Test (timeout = 1000)
    public void testCalcArea() throws Exception {
        circle.calcArea();
        final Double result = circle.getArea();

        final Double expected = Math.PI * radius * radius;
        assertEquals(expected, result);
    }
}