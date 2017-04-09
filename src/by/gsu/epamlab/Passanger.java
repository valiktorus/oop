package by.gsu.epamlab;

public class Passanger implements Transportable {
    private String name;
    private double mass;

    public Passanger() {
        super();
    }

    public Passanger(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public double getFinalMass() {
        return mass;
    }

    @Override
    public String toString() {
        return name + ";" + mass;
    }
}
