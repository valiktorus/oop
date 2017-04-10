package by.gsu.epamlab.cargo;

import by.gsu.epamlab.material.impl.HardMaterial;
import by.gsu.epamlab.material.Material;

public abstract class AbstractCargo {
    private final double volume;
    private final Material material;

    public AbstractCargo() {
        this(0);
    }

    public AbstractCargo(double volume) {
        this(volume, HardMaterial.EMPTY);
    }

    public AbstractCargo(double volume, Material material) {
        this.volume = volume;
        this.material = material;
    }

    public double getMass(){
        return volume * material.getDensity();
    }

    @Override
    public String toString() {
        return material.toString() + ";" + volume;
    }
}
