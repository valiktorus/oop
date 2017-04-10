package by.gsu.epamlab.cargo;

public abstract class AbstractCargo {
    private final double volume;

    public AbstractCargo() {
        super();
        volume = 0;
    }

    public AbstractCargo(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public abstract double getMass();

    protected abstract String fieldsToString();

    @Override
    public String toString() {
        return fieldsToString() + ";" + volume;
    }
}
