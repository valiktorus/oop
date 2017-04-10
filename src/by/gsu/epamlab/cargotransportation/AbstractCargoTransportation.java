package by.gsu.epamlab.cargotransportation;

import by.gsu.epamlab.Transportable;

public abstract class AbstractCargoTransportation implements Transportable {

    public AbstractCargoTransportation() {
        super();
    }
    public abstract String fieldsToString();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ";" + fieldsToString()+ ";" + getMass();
    }
}
