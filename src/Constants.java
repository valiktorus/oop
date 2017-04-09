import by.gsu.epamlab.CisternCargoTransportation;
import by.gsu.epamlab.ContainerCargoTransportation;
import by.gsu.epamlab.cargo.HardCargo;
import by.gsu.epamlab.cargo.HardMaterial;
import by.gsu.epamlab.cargo.LiquidCargo;
import by.gsu.epamlab.cargo.LiquidMaterial;

public class Constants {
    public class CisternCargo{
        public static final double SMALL_CISTERN_CARGO_VOLUME = 2000;
        public static final double MEDIUM_CISTERN_CARGO_VOLUME = 3000;
        public static final double BIG_CISTERN_CARGO_VOLUME = 4000;
        public static final double SMALL_CISTERN_CARGO_CARCASE_MASS = 2000;
        public static final double MEDIUM_CISTERN_CARGO_CARCASE_MASS = 3000;
        public static final double BIG_CISTERN_CARGO_CARCASE_MASS = 4000;
    }
    public class ConteinerCargo{
        public static final double SMALL_CONTEINER_CARGO_VOLUME = 2000;
        public static final double MEDIUM_CONTEINER_CARGO_VOLUME = 3000;
        public static final double BIG_CONTEINER_CARGO_VOLUME = 4000;
        public static final double SMALL_CONTEINER_CARGO_CARCASE_MASS = 2000;
        public static final double MEDIUM_CONTEINER_CARGO_CARCASE_MASS = 3000;
        public static final double BIG_CONTEINER_CARGO_CARCASE_MASS = 4000;
    }

    public static final CisternCargoTransportation WATER_CISTERN_CARGO = new CisternCargoTransportation(CisternCargo.SMALL_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(CisternCargo.SMALL_CISTERN_CARGO_VOLUME, LiquidMaterial.WATER));
    public static final CisternCargoTransportation GASOLINE_CISTERN_CARGO = new CisternCargoTransportation(CisternCargo.MEDIUM_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(CisternCargo.MEDIUM_CISTERN_CARGO_VOLUME, LiquidMaterial.GASOLINE));
    public static final CisternCargoTransportation PETROL_CISTERN_CARGO = new CisternCargoTransportation(CisternCargo.BIG_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(CisternCargo.BIG_CISTERN_CARGO_VOLUME, LiquidMaterial.PETOL));

    public static final ContainerCargoTransportation IRON_CONTEINER_CARGO = new ContainerCargoTransportation(ConteinerCargo.SMALL_CONTEINER_CARGO_CARCASE_MASS,new HardCargo(ConteinerCargo.SMALL_CONTEINER_CARGO_VOLUME, HardMaterial.IRON));

}
