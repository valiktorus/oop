package by.gsu.epamlab;

import by.gsu.epamlab.cargo.HardCargo;

public class ContainerCargoTransportation extends StandardCargoTransportation {
    private HardCargo cargo;

    public ContainerCargoTransportation(double carcaseMass) {
        super(carcaseMass);
    }

    public ContainerCargoTransportation(double carcaseMass, HardCargo cargo) {
        super(carcaseMass);
        this.cargo = cargo;
    }

    @Override
    public double getFinalMass() {
        return cargo.getMass() + getCarcaseMass();
    }

    @Override
    public String fieldsToString() {
        return cargo.toString();
    }
}
