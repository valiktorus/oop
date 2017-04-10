package by.gsu.epamlab.util;

import by.gsu.epamlab.transportation.Transportable;

public class TransportableUtil {
    private TransportableUtil() {
    }
    public static void printTranspotrable(Transportable[] transportables){
        for (Transportable transportable: transportables) {
            System.out.println(transportable);
        }
    }
}
