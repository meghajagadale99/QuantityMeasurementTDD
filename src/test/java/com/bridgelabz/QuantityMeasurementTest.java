package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    //FEET
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }


    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    //NULL CHECK
    @Test
    public void givenAnd0FeetNullFeet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    //REF CHECK
    @Test
    public void GivenReference0FeetAnd1Feet_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    //TYPE CHECK
    @Test
    public void GivenTypeCheckFor0FeetAnd1Feet_ShouldReturnEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    //INCH
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    //NULL CHECK
    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    //REF CHECK
    @Test
    public void Given0InchAnd1InchReference_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    //TYPE CHECK
    @Test
    public void GivenTypeCheckFor0InchAnd1Inch_ShouldReturnEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    //FEET & INCH
    @Test
    public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    //UC1
    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    //YARD

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertFalse(compareCheck);
    }

    //NULL CHECK
    @Test
    public void given0YardAndNullYard_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    //REF CHECK
    @Test
    public void Given0yardAnd1yardReference_shouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    //TYPE CHECK
    @Test
    public void GivenTypeCheckFor0yardAnd1yard_ShouldReturnEquals() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    //UC2
    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }
}
