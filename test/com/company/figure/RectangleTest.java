package com.company.figure;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class RectangleTest {
    public static final Double width = 5.678;
    public static final Double height = 9.101;
    private static Rectangle rectangle;

    @BeforeClass
    public static void setUpClass() throws Exception {
        rectangle = new Rectangle(width, height);
    }

    @Test
    public void testCalcArea() throws Exception {
        rectangle.calcArea();
        final Double result = rectangle.getArea();

        final Double expectedResult = width * height;
        assertEquals(expectedResult, result);
    }
}