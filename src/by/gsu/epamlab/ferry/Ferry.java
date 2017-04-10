package by.gsu.epamlab.ferry;

import by.gsu.epamlab.Transportable;

public class Ferry {
    private double carryingCapacity;
    private Transportable[] transportables;

    public Ferry(double carryingCapacity, Transportable... transportables) {
        this.carryingCapacity = carryingCapacity;
        this.transportables = transportables;
    }

    public Transportable[] getTransportables() {
        return transportables;
    }

    public boolean isPassed(){
        return carryingCapacity > getTotalMass();
    }

    public double getTotalMass(){
        double totalMass = 0;
        for (Transportable transportable: transportables) {
            totalMass += transportable.getMass();
        }
        return totalMass;
    }
}
