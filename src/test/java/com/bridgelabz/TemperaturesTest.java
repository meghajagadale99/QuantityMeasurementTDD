package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperaturesTest {
    //FAHRENHEIT
    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1, temperature2);
    }

    @Test
    void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        Temperature temperature21 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature22 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature21, temperature22);
    }

    //NULL CHECK
    @Test
    void given0FahrenheitAndNull_ShouldReturnNotEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = null;
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    //TYPE CHECK
    @Test
    public void givenType0FahrenheitAnd1Fahrenheit_ShouldReturnEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertEquals(temperature1.getClass(), temperature2.getClass());
    }

    //REF CHECK
    @Test
    public void givenReference0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    //CELSIUS
    @Test
    void given0celsiusAnd0celsius_ShouldReturnEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Assertions.assertEquals(celsius1, celsius2);
    }

    @Test
    void given0celsiusAnd1celsius_ShouldReturnNotEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = new Temperature(Temperature.Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    //NULL CHECK
    @Test
    void given0celsiusAndNull_ShouldReturnNotEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = null;
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    //TYPE CHECK
    @Test
    public void givenType0celsiusAnd1celsius_ShouldReturnEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = new Temperature(Temperature.Unit.CELSIUS, 1.0);
        Assertions.assertEquals(celsius1.getClass(), celsius2.getClass());
    }

    //REF CHECK
    @Test
    public void givenReference0celsiusAnd1celsius_ShouldReturnNotEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = new Temperature(Temperature.Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(celsius1, celsius2);
    }

    //UC 8
    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqual() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}
