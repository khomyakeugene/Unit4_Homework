package com.company;

import com.company.tests.TestDistanceData;
import com.company.tests.TestFigureData;
import com.company.tests.TestTemperatureData;

public class Main {
    public static void main(String[] args) throws Exception {
        demonstrateData();
    }

    public static void demonstrateData() throws Exception  {
        new TestFigureData().demonstrateData();

        new TestTemperatureData().demonstrateTemperatureData();

        new TestDistanceData().demonstrateDistanceData();
    }
}
