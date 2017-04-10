package by.gsu.epamlab.transportation;

import by.gsu.epamlab.material.Material;

public abstract class StandardizedCargo extends AbstractCargo {
    private final double volume;
    private final Material material;

    public StandardizedCargo(double containerMass, double volume, Material material) {
        super(containerMass);
        this.volume = volume;
        this.material = material;
    }

    @Override
    public String toString() {
        return material + ";" + getMass();
    }

    @Override
    public double getCargoMass() {
        return material.getDensity() * volume;
    }
}
