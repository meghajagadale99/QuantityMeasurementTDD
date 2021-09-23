package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightSTest {
    //GRAM
    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    //NULL CHECK
    @Test
    public void given0GramAndNULLGram_ShouldReturnNotEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    //TYPE CHECK
    @Test
    public void givenType0GramAnd1Gram_ShouldReturnEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    //REF TYPE
    @Test
    public void givenReference0GramAnd1Gram_ShouldReturnNotEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    //Tonne
    @Test
    public void given0TonneAnd0Tonne_ShouldReturnEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    public void given0TonneAnd1Tonne_ShouldReturnNotEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    //NULL CHECK
    @Test
    public void givenNullTonneAnd1Tonne_ShouldReturnNotEqual() {
        QuantityMeasurement tonne1 = null;
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    //TYPE CHECK
    @Test
    public void givenType0TonneAnd1Tonne_ShouldReturnEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    //REF CHECK
    @Test
    public void givenReference0TonneAnd1Tonne_ShouldReturnNotEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    //Kilogram
    @Test
    public void given0KilogramAnd0Kilogram_ShouldReturnEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    //NULL CHECK
    @Test
    public void givenNullKilogramAnd1Kilogram_ShouldReturnNotEqual() {
        QuantityMeasurement kilogram1 = null;
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    //TYPE CHECK
    @Test
    public void givenType0KilogramAnd1Kilogram_ShouldReturnEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertEquals(kilogram1.getClass(), kilogram2.getClass());
    }

    //REF CHECK
    @Test
    public void givenReference0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    //UC 7
    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 1000.0);
        boolean compareCheck = kilogram1.compare(gram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 1000.0);
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        boolean compareCheck = gram1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 1.0);
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 1000.0);
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 1.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        try {
            QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 1.0);
            QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 1000.0);
            QuantityMeasurement expectedSum = new QuantityMeasurement(Weight.KILOGRAM, 1001.0);
            QuantityMeasurement actualSum = tonne1.addition(gram1, Weight.KILOGRAM);
            Assertions.assertEquals(expectedSum, actualSum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
