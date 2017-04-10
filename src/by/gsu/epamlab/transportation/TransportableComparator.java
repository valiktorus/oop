package by.gsu.epamlab.transportation;

import by.gsu.epamlab.Transportable;

import java.util.Comparator;

public class TransportableComparator implements Comparator<Transportable> {
    @Override
    public int compare(Transportable first, Transportable second) {
        return TransportableType.getPriority(first) - TransportableType.getPriority(second);
    }
}
