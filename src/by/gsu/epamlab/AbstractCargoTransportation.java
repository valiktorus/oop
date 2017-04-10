package by.gsu.epamlab;

public abstract class AbstractCargoTransportation implements Transportable{

    public AbstractCargoTransportation() {
        super();
    }
    public abstract String fieldsToString();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ";" + fieldsToString()+ ";" + getFinalMass();
    }
}
