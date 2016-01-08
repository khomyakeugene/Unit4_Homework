package com.company.tests;

import com.company.temperature.Temperature;
import com.company.utils.Utils;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class TestTemperatureData {
    public final static String CELSIUS_TO_FAHRENHEIT_MESSAGE = "Celsius ({0}) --> Fahrenheit ({1})";
    public final static String FAHRENHEIT_TO_CELSIUS_MESSAGE = "Fahrenheit ({0}) --> Celsius  ({1})";

    public final static Double TEST_CELSIUS_DEGREE = 15.0;
    public final static Double TEST_FAHRENHEIT_DEGREE = 30.0;

    public void demonstrateTemperatureData() {
        Utils.writeMessage(MessageFormat.format(CELSIUS_TO_FAHRENHEIT_MESSAGE, TEST_CELSIUS_DEGREE, Temperature.transformCelsiusToFahrenheit(TEST_CELSIUS_DEGREE)));
        Utils.writeMessage(MessageFormat.format(FAHRENHEIT_TO_CELSIUS_MESSAGE, TEST_FAHRENHEIT_DEGREE, Temperature.transformFahrenheitToCelsius(TEST_FAHRENHEIT_DEGREE)));

    }
}
