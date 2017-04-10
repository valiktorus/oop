package by.gsu.epamlab.passenger;

import by.gsu.epamlab.Transportable;

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
    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ";" + name + ";" + mass;
    }
}
