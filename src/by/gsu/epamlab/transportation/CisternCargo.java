package by.gsu.epamlab.transportation;

import by.gsu.epamlab.material.impl.LiquidMaterial;

public class CisternCargo extends StandardizedCargo {

    public CisternCargo(double containerMass, double volume, LiquidMaterial material) {
        super(containerMass, volume, material);
    }
}
