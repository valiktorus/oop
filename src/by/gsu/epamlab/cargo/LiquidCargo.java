package by.gsu.epamlab.cargo;

public class LiquidCargo extends AbstractCargo{
    private LiquidMaterial material;

    public LiquidCargo() {
        super();
    }

    public LiquidCargo(double volume, LiquidMaterial material) {
        super(volume);
        this.material = material;
    }

    @Override
    public double getMass() {
        return material.getDensity() * getVolume();
    }

    @Override
    public String toString() {
        return material.name().toLowerCase();
    }
}
