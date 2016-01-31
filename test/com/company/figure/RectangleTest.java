package com.company.figure;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class RectangleTest {

    @Test
    public void testCalcArea() throws Exception {
        final Double width = 5.0;
        final Double height = 3.0;
        Rectangle rectangle = new Rectangle(width, height);

        rectangle.calcArea();
        final Double result = rectangle.getArea();

        final Double expectedResult = 15.0;
        Assert.assertEquals(expectedResult, result);
    }
}