package by.gsu.epamlab.transportation.cargo.impl;

import by.gsu.epamlab.transportation.cargo.AbstractCargo;

public class PlatformCargo extends AbstractCargo {
    private final double mass;

    public PlatformCargo(double containerMass, double mass) {
        super(containerMass);
        this.mass = mass;
    }
    @Override
    public double getCargoMass() {
        return mass;
    }
}
