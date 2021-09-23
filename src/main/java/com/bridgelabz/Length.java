package com.bridgelabz;

public enum Length implements Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    public final double unitConversion;

    Length(double unitConversion) {
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