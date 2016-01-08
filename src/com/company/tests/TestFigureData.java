package com.company.tests;

import com.company.figure.CalcSimpleGeometricFigureArea;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class TestFigureData {
    public final Double TEST_CIRCLE_RADIUS = 1.234;

    public final Double TEST_RECTANGLE_WIDTH = 5.678;
    public final Double TEST_RECTANGLE_HEIGHT = 9.101;

    public final Double TEST_FIRST_TRIANGLE_SIDE = 7.0;
    public final Double TEST_FIRST_SECOND_SIDE = 3.0;
    public final Double TEST_THIRD_TRIANGLE_SIDE = 6.0;

    public void demonstrateData() throws Exception {
        CalcSimpleGeometricFigureArea calcSimpleGeometricFigureArea = new CalcSimpleGeometricFigureArea();

        calcSimpleGeometricFigureArea.calcCircleArea(TEST_CIRCLE_RADIUS, true);
        calcSimpleGeometricFigureArea.calcRectangleArea(TEST_RECTANGLE_WIDTH, TEST_RECTANGLE_HEIGHT, true);
        calcSimpleGeometricFigureArea.calcTriangleArea(TEST_FIRST_TRIANGLE_SIDE, TEST_FIRST_SECOND_SIDE, TEST_THIRD_TRIANGLE_SIDE, true);
    }
}
