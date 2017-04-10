package by.gsu.epamlab.cargotransportation;

import by.gsu.epamlab.cargo.LiquidCargo;

public class CisternCargoTransportation extends StandardCargoTransportation {
    private LiquidCargo cargo;

    public CisternCargoTransportation() {
        super();
    }

    public CisternCargoTransportation(double carcaseMass) {
        super(carcaseMass);
    }

    public CisternCargoTransportation(double carcaseMass, LiquidCargo cargo) {
        super(carcaseMass);
        this.cargo = cargo;
    }

    @Override
    public double getMass() {
        return cargo.getMass() + getCarcaseMass();
    }

    @Override
    public String fieldsToString() {
        return cargo.toString();
    }
}
