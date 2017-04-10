package by.gsu.epamlab.transportation;

import by.gsu.epamlab.Transportable;
import by.gsu.epamlab.transportation.cargo.impl.CisternCargo;
import by.gsu.epamlab.transportation.cargo.impl.ContainerCargo;
import by.gsu.epamlab.transportation.cargo.impl.PlatformCargo;
import by.gsu.epamlab.transportation.passenger.Passenger;

public enum TransportableType {
    PASSENGER(Passenger.class),
    CONTAINER_CARGO(ContainerCargo.class),
    CISTERN_CARGO(CisternCargo.class),
    PLATFORM_CARGO(PlatformCargo.class);

    private final Class transportableClass;

    TransportableType(Class transportableClass) {
        this.transportableClass = transportableClass;
    }
    public static int getPriority(Transportable transportable){
        for (TransportableType type: TransportableType.values()) {
            if (type.transportableClass.equals(transportable.getClass())){
                return type.ordinal();
            }
        }
        return Integer.MIN_VALUE;
    }
}