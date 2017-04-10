package by.gsu.epamlab.cargo;

/**
 * Created by Torus on 10.04.2017.
 */
public class Material {
    public enum LiquidMaterial {
        WATER(1000.0), PETROL(900.0), GASOLINE(700.0), PARRAFFIN(800.0);
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
}
