package by.gsu.epamlab.cargo;

public enum LiquidMaterial {
    WATER(1000.0), PETOL(900.0), GASOLINE(700.0), PARRAFFIN(800.0);
    private final double density;

    LiquidMaterial(double density) {
        this.density = density;
    }

    public String getName(){
        return name().toLowerCase();
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return getName();
    }
}
