package com.company.tests;

import com.company.utils.Utils;

import java.text.MessageFormat;

import static com.company.temperature.Temperature.*;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class TestTemperatureData {
    public final static String CELSIUS_TO_FAHRENHEIT_MESSAGE = "Celsius ({0}) --> Fahrenheit ({1})";
    public final static String FAHRENHEIT_TO_CELSIUS_MESSAGE = "Fahrenheit ({0}) --> Celsius  ({1})";

    public final static Double TEST_CELSIUS_DEGREE = 15.0;
    public final static Double TEST_FAHRENHEIT_DEGREE = 30.0;

    public void demonstrateTemperatureData() {
        Utils.printMessage(MessageFormat.format(CELSIUS_TO_FAHRENHEIT_MESSAGE, TEST_CELSIUS_DEGREE,
                transformCelsiusToFahrenheit(TEST_CELSIUS_DEGREE)));
        Utils.printMessage(MessageFormat.format(FAHRENHEIT_TO_CELSIUS_MESSAGE, TEST_FAHRENHEIT_DEGREE,
                transformFahrenheitToCelsius(TEST_FAHRENHEIT_DEGREE)));

    }
}
