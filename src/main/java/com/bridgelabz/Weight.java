package com.bridgelabz;

public enum Weight implements Unit {
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    public final double unitConversion;

    Weight(double unitConversion) {
        this.unitConversion = unitConversion;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurement object) {
        return (object.value * unitConversion);
    }

    @Override
    public boolean getaddition() {
        return true;
    }
}
