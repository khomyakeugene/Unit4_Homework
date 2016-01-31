package com.company.figure;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class TriangleTest {
    public static final Double TEST_FIRST_TRIANGLE_SIDE = 7.0;
    public static final Double TEST_FIRST_SECOND_SIDE = 3.0;
    public static final Double TEST_THIRD_TRIANGLE_SIDE = 6.0;
    private static Triangle triangle;

    @BeforeClass
    public static void setUpClass() throws Exception {
        triangle = new Triangle(TEST_FIRST_TRIANGLE_SIDE, TEST_FIRST_SECOND_SIDE, TEST_THIRD_TRIANGLE_SIDE);
    }

    @Test
    public void testCalcPerimeter() throws Exception {
        final Double result = triangle.calcPerimeter();

        final Double expectedResult = TEST_FIRST_TRIANGLE_SIDE + TEST_FIRST_SECOND_SIDE + TEST_THIRD_TRIANGLE_SIDE;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalcArea() throws Exception {
        triangle.calcArea();
        final Double result = triangle.getArea();

        final Double expectedResult = 8.94427190999916;
        assertEquals(expectedResult, result);
    }
}