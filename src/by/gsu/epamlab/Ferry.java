package by.gsu.epamlab;

public class Ferry {
    private double carryingCapacity;
    private Transportable[] transportables;

    public Ferry(double carryingCapacity, Transportable... transportables) {
        this.carryingCapacity = carryingCapacity;
        this.transportables = transportables;
    }
    public boolean isPassed(){
        return carryingCapacity > getTotalMass();
    }
    public double getTotalMass(){
        double totalMass = 0;
        for (Transportable transportable: transportables) {
            totalMass += transportable.getFinalMass();
        }
        return totalMass;
    }
    public void printTransportables(){
        for (Transportable transportable: transportables) {
            System.out.println(transportable);
        }
    }
}
