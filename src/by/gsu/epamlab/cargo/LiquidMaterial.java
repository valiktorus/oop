package by.gsu.epamlab.cargo;

public enum LiquidMaterial implements Material{
    WATER(1000.0), PETROL(900.0), GASOLINE(700.0), PARAFFIN(800.0),EMPTY(0);
    private final double density;

    LiquidMaterial(double density) {
        this.density = density;
    }

    @Override
    public String getName(){
        return name().toLowerCase();
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return getName();
    }
}
