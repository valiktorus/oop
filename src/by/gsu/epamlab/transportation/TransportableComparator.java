package by.gsu.epamlab.transportation;

import java.util.Comparator;

public class TransportableComparator implements Comparator<Transportable> {
    @Override
    public int compare(Transportable first, Transportable second) {
        return TransportableType.getPriority(second) - TransportableType.getPriority(first);
    }
}
