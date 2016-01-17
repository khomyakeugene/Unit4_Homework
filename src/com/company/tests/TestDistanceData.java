package com.company.tests;

import com.company.distance.Distance;
import com.company.distance.Point;
import com.company.utils.Utils;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class TestDistanceData {
    public static final String DISTANCE_MESSAGE = "Distance between ({0}; {1}) and ({2}; {3}) is {4}";

    public static final Double X1 = 3.0;
    public static final Double Y1 = 5.3;
    public static final Double X2 = 7.2;
    public static final Double Y2 = 1.1;

    public void demonstrateDistanceData() {
        Point point1 = new Point(X1, Y1);
        Point point2 = new Point(X2, Y2);

        Utils.printMessage(MessageFormat.format(DISTANCE_MESSAGE, point1.getX(), point1.getY(),
                point2.getX(), point2.getY(), Distance.calcDistance(point1,point2)));
    }
}
