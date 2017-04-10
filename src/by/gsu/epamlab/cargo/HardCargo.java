package by.gsu.epamlab.cargo;

public class HardCargo extends AbstractCargo {
    private HardMaterial material;

    public HardCargo() {
       this(0, HardMaterial.EMPTY);
    }

    public HardCargo(double volume, HardMaterial material) {
        super(volume);
        this.material = material;
    }
}
