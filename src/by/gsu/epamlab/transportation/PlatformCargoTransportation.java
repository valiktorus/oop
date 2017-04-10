package by.gsu.epamlab.transportation;

import by.gsu.epamlab.cargo.AbstractCargo;

import java.util.Arrays;

public class PlatformCargoTransportation extends AbstractCargoTransportation{
    private AbstractCargo[] cargos;

    public PlatformCargoTransportation(AbstractCargo... cargos) {
        this.cargos = cargos;
    }

    @Override
    public double getMass() {
        double result = 0;
        for (AbstractCargo cargo: cargos) {
            result += cargo.getMass();
        }
        return result;
    }

    @Override
    public String fieldsToString() {
        return Arrays.toString(cargos);
    }
}