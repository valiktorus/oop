package by.gsu.epamlab.cargo;

public enum HardMaterial {
    COAL(1450.0),IRON(7800.0),COOPER(8900.0),PLUMB(11340.0);

    private final double density;

    HardMaterial(double density) {
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
