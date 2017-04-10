package by.gsu.epamlab.transportation.cargo.impl;

import by.gsu.epamlab.transportation.cargo.StandardizedCargo;
import by.gsu.epamlab.material.impl.HardMaterial;

public class ContainerCargo extends StandardizedCargo {
    public ContainerCargo(double containerMass, double volume, HardMaterial material) {
        super(containerMass, volume, material);
    }
}
