package com.company.figure;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class TriangleTest {
    static final Double firstSide = 7.0;
    static final Double secondSide = 3.0;
    static final Double thirdSide = 6.0;
    private static Triangle triangle;

    @BeforeClass
    public static void setUpClass() throws Exception {
        triangle = new Triangle(firstSide, secondSide, thirdSide);
    }

    @Test (timeout = 1000)
    public void testCalcPerimeter() throws Exception {
        final Double result = triangle.calcPerimeter();

        final Double expected = firstSide + secondSide + thirdSide;
        assertEquals(expected, result);
    }

    @Test (timeout = 1000)
    public void testCalcArea() throws Exception {
        triangle.calcArea();
        final Double result = triangle.getArea();

        final Double expected = 8.94427190999916;
        assertEquals(expected, result);
    }
}