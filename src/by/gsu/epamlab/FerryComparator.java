package by.gsu.epamlab;

import java.util.Comparator;

/**
 * Created by Torus on 10.04.2017.
 */
public class FerryComparator implements Comparator<Transportable> {
    @Override
    public int compare(Transportable first, Transportable second) {
        return TransportableEnum.valueOf(first.getClass().getSimpleName().toUpperCase()).ordinal() -
                TransportableEnum.valueOf(second.getClass().getSimpleName().toUpperCase()).ordinal();
    }
}
