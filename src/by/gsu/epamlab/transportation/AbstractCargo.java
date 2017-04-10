package by.gsu.epamlab.transportation;

import by.gsu.epamlab.Cargo;

public abstract class AbstractCargo  implements Cargo{
    private final double containerMass;

    public AbstractCargo(double containerMass) {
        this.containerMass = containerMass;
    }
    public abstract double getCargoMass();

    @Override
    public double getMass() {
        return getCargoMass() + containerMass;
    }
}
