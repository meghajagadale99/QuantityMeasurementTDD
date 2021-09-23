package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumesTest {
    //GALLON
    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    //NULL CHECK
    @Test
    public void given0GallonAndNullGallon_ShouldReturnNotEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    //REF CHECK
    @Test
    public void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    //TYPE CHECK
    @Test
    public void givenType0GallonAnd1Gallon_ShouldReturnEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    //LITRES
    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAnd1Litre_ShouldReturnNotEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    //NULL CHECK
    @Test
    public void given0LitreAndNullLitre_ShouldReturnNotEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    //REF CHECK
    @Test
    public void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    //TYPE CHECK
    @Test
    public void givenType0LitreAnd1Litre_ShouldReturnEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 0.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertFalse(compareCheck);
    }

    //UC5
    @Test
    public void given1GallonAnd3point78Litre_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    //Milliliter
    @Test
    public void given0MilliliterAnd0Milliliter_ShouldReturnEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        Assertions.assertEquals(millilitre1, millilitre2);
    }

    @Test
    public void given0MilliliterAnd1Milliliter_ShouldReturnNotEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    //NULL CHECK
    @Test
    public void given1MilliliterNullMilliliter_ShouldReturnNotEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
        QuantityMeasurement millilitre2 = null;
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    //REF CHECK
    @Test
    public void givenReference0MilliliterAnd0Milliliter_ShouldReturnNotEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        Assertions.assertNotSame(millilitre1, millilitre2);
    }

    //TYPE CHECK
    @Test
    public void givenType0MilliliterAnd1Milliliter_ShouldReturnEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
        Assertions.assertEquals(millilitre1.getClass(), millilitre2.getClass());
    }

    @Test
    public void given0LiterAnd0MilliLitre_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    //UC5
    @Test
    public void given1LiterAnd1000MilliLitre_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
        QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLitreAnd1Litre_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
        boolean compareCheck = millilitre.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    //UC6
    @Test
    public void given1GallonAnd3point78Litre_WhenAdded_ShouldReturn7point57Liter() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
            QuantityMeasurement expected = new QuantityMeasurement(Volume.LITRE, 7.56);
            QuantityMeasurement actual = gallon.addition(litre, Volume.LITRE);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1LitreAnd1000MilliLitre_WhenAdded_ShouldReturn2Liter() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
            QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
            QuantityMeasurement expected = new QuantityMeasurement(Volume.LITRE, 2.0);
            QuantityMeasurement actual = litre.addition(millilitre, Volume.LITRE);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
