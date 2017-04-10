package by.gsu.epamlab;

public class Passenger implements Transportable {
    private String name;
    private double mass;

    public Passenger() {
        super();
    }

    public Passenger(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public double getFinalMass() {
        return mass;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ";" + name + ";" + mass;
    }
}
