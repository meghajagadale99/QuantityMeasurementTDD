package com.bridgelabz;

public enum Unit implements Conversion {
    FEET(12.0), INCH(1.0), YARD(36.0);


    public final double unitConversion;

    Unit(double unitConversion) {
        this.unitConversion = unitConversion;
    }


    @Override
    public double convertToBaseUnit(QuantityMeasurement object) {
        return (object.value * unitConversion);
    }

}