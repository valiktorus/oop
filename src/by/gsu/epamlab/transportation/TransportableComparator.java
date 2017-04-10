package by.gsu.epamlab.transportation;

import by.gsu.epamlab.Transportable;

import java.util.Comparator;

public class TransportableComparator implements Comparator<Transportable> {
    @Override
    public int compare(Transportable first, Transportable second) {
        return TransportableEnum.valueOf(first.getClass().getSimpleName().toUpperCase()).ordinal() -
                TransportableEnum.valueOf(second.getClass().getSimpleName().toUpperCase()).ordinal();
    }
}
