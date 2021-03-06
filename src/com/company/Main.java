package com.company;

import com.company.tests.TestDistanceData;
import com.company.tests.TestFigureData;
import com.company.tests.TestMonteCarloIntegralCalculation;
import com.company.tests.TestTemperatureData;

public class Main {
    public static void main(String[] args) throws Exception {
        demonstrateData();
    }

    public static void demonstrateData() throws Exception  {
        // Main task for Unit 4
        unit4MainTask();

        // -------------------------------------------------------------------------
        // Additional task for Unit 4: Integral calculating using Monte Carlo method
        unit4AdditionalTask();
    }

    // Main task for Unit 4
    public static void unit4MainTask() throws Exception  {
        new TestFigureData().demonstrateData();

        new TestTemperatureData().demonstrateTemperatureData();

        new TestDistanceData().demonstrateDistanceData();
    }

    // Additional task for Unit 4: Integral calculating using Monte Carlo method
    public static void unit4AdditionalTask() {
        new TestMonteCarloIntegralCalculation().demonstrateCarloIntegralCalculation();
    }
}
