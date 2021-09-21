package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    //FEET
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    //NULL CHECK
    @Test
    public void givenAnd0FeetNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    //REF CHECK
    @Test
    public void GivenReference0FeetAnd1Feet_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    //TYPE CHECK
    @Test
    public void GivenTypeCheckFor0FeetAnd1Feet_ShouldReturnEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertEquals(feet1.getClass(), feet2.getClass());
    }

    //INCH
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    //NULL CHECK
    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    //REF CHECK
    @Test
    public void Given0InchAnd1InchReference_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    //TYPE CHECK
    @Test
    public void GivenTypeCheckFor0InchAnd1Inch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertEquals(inch1.getClass(), inch2.getClass());
    }


}