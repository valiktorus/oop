package by.gsu.epamlab.transportation.cargo.impl;

import by.gsu.epamlab.transportation.cargo.StandardizedCargo;
import by.gsu.epamlab.material.impl.LiquidMaterial;

public class CisternCargo extends StandardizedCargo {

    public CisternCargo(double containerMass, double volume, LiquidMaterial material) {
        super(containerMass, volume, material);
    }

}
