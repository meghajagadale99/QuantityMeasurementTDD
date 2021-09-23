package com.bridgelabz;

public enum Volume implements Unit {
    MILLILITRE(0.001), LITRE(1), GALLON(3.78);

    public final double unitConversion;

    Volume(double unitConversion) {
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