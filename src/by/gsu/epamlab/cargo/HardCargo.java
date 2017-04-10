package by.gsu.epamlab.cargo;

public class HardCargo extends AbstractCargo {
    private HardMaterial material;

    public HardCargo() {
        super();
    }

    public HardCargo(double volume, HardMaterial material) {
        super(volume);
        this.material = material;
    }

    @Override
    public double getMass() {
        return material.getDensity() * getVolume();
    }

    @Override
    protected String fieldsToString() {
        return material.toString();
    }
}
