package com.bridgelabz;

public class QuantityMeasurement {
    public Unit unit;
    public double value;

    public QuantityMeasurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(QuantityMeasurement that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    public QuantityMeasurement addition(QuantityMeasurement that, Conversion requiredUnit) {
        double sumOfInput = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new QuantityMeasurement((Unit) requiredUnit, sumOfInput);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }
}
