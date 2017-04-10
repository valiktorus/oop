package by.gsu.epamlab.cargo;

import by.gsu.epamlab.material.impl.LiquidMaterial;

public class LiquidCargo extends AbstractCargo{
    private LiquidMaterial material;

    public LiquidCargo(){
        this(0, LiquidMaterial.EMPTY);
    }

    public LiquidCargo(double volume, LiquidMaterial material) {
        super(volume);
        this.material = material;
    }
}
