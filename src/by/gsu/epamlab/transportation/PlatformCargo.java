package by.gsu.epamlab.transportation;

public class PlatformCargo extends AbstractCargo{
    private final double mass;

    public PlatformCargo(double containerMass, double mass) {
        super(containerMass);
        this.mass = mass;
    }
    @Override
    public double getCargoMass() {
        return mass;
    }
}
