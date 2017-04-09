package by.gsu.epamlab;

public abstract class StandardCargoTransportation extends AbstractCargoTransportation {
    private double carcaseMass;

    public StandardCargoTransportation() {
        super();
    }

    public StandardCargoTransportation(double carcaseMass) {
        super();
        this.carcaseMass = carcaseMass;
    }

    public double getCarcaseMass() {
        return carcaseMass;
    }
}
