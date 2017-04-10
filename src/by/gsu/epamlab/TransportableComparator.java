package by.gsu.epamlab;

import java.util.Comparator;

public class TransportableComparator implements Comparator<Transportable> {
    @Override
    public int compare(Transportable first, Transportable second) {
        return TransportableEnum.valueOf(first.getClass().getSimpleName().toUpperCase()).ordinal() -
                TransportableEnum.valueOf(second.getClass().getSimpleName().toUpperCase()).ordinal();
    }
}
