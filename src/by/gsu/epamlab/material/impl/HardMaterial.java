package by.gsu.epamlab.material.impl;

import by.gsu.epamlab.material.Material;

public enum HardMaterial implements Material {
    COAL(1450.0),IRON(7800.0),COOPER(8900.0),PLUMB(11340.0),EMPTY(0);

    private final double density;

    HardMaterial(double density) {
        this.density = density;
    }

    @Override
    public String getName(){
        return name().toLowerCase();
    }
    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return getName();
    }
}
