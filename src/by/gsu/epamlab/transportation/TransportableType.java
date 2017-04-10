package by.gsu.epamlab.transportation;

import by.gsu.epamlab.transportation.cargo.impl.CisternCargo;
import by.gsu.epamlab.transportation.cargo.impl.ContainerCargo;
import by.gsu.epamlab.transportation.cargo.impl.PlatformCargo;
import by.gsu.epamlab.transportation.passenger.Passenger;
import by.gsu.epamlab.transportation.passenger.impl.PassengerImpl;

public enum TransportableType {
    CISTERN_CARGO(CisternCargo.class),
    PLATFORM_CARGO(PlatformCargo.class),
    CONTAINER_CARGO(ContainerCargo.class),
    PASSENGER(PassengerImpl.class);

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