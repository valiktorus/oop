import by.gsu.epamlab.transportation.cargo.Cargo;
import by.gsu.epamlab.transportation.cargo.impl.CisternCargo;
import by.gsu.epamlab.transportation.cargo.impl.ContainerCargo;
import by.gsu.epamlab.transportation.cargo.impl.PlatformCargo;
import by.gsu.epamlab.transportation.passenger.impl.PassengerImpl;
import by.gsu.epamlab.material.impl.HardMaterial;
import by.gsu.epamlab.material.impl.LiquidMaterial;

public class Constants {
    public class CisternCargoConstants{
        public static final double SMALL_CISTERN_CARGO_VOLUME = 180;
        public static final double MEDIUM_CISTERN_CARGO_VOLUME = 280;
        public static final double BIG_CISTERN_CARGO_VOLUME = 380;

        public static final double SMALL_CISTERN_CARGO_CARCASE_MASS = 1000;
        public static final double MEDIUM_CISTERN_CARGO_CARCASE_MASS = 2000;
        public static final double BIG_CISTERN_CARGO_CARCASE_MASS = 3000;
    }
    public class ContainerCargoConstants {
        public static final double BIG_CONTAINER_CARGO_VOLUME = 400;

        public static final double SMALL_CONTAINER_CARGO_CARCASE_MASS = 1000;
        public static final double MEDIUM_CONTAINER_CARGO_CARCASE_MASS = 2000;
        public static final double BIG_CONTAINER_CARGO_CARCASE_MASS = 3000;
    }

    public static class PlatformCargoConstants{
        public static final double BIG_ITEM_MASS = 1400;
    }

    public class PassengerConstants{
        public static final String FIRST_PASSENGER_NAME = "Mike";
        public static final String SECOND_PASSENGER_NAME = "Peter";
        public static final String THIRD_PASSENGER_NAME = "Robert";
        public static final double FIRST_PASSENGER_MASS = 75;
        public static final double SECOND_PASSENGER_MASS = 83;
        public static final double THIRD_PASSENGER_MASS = 90;
    }

    public static final Cargo WATER_CISTERN_CARGO = new CisternCargo(CisternCargoConstants.SMALL_CISTERN_CARGO_CARCASE_MASS, CisternCargoConstants.SMALL_CISTERN_CARGO_VOLUME, LiquidMaterial.WATER);
    public static final Cargo GASOLINE_CISTERN_CARGO = new CisternCargo(CisternCargoConstants.MEDIUM_CISTERN_CARGO_CARCASE_MASS, CisternCargoConstants.MEDIUM_CISTERN_CARGO_VOLUME, LiquidMaterial.GASOLINE);
    public static final Cargo PETROL_CISTERN_CARGO = new CisternCargo(CisternCargoConstants.BIG_CISTERN_CARGO_CARCASE_MASS, CisternCargoConstants.BIG_CISTERN_CARGO_VOLUME, LiquidMaterial.GASOLINE);
    public static final Cargo IRON_CONTAINER_CARGO = new ContainerCargo(ContainerCargoConstants.BIG_CONTAINER_CARGO_CARCASE_MASS, ContainerCargoConstants.BIG_CONTAINER_CARGO_VOLUME, HardMaterial.IRON);
    public static final Cargo COAL_CONTAINER_CARGO = new ContainerCargo(ContainerCargoConstants.MEDIUM_CONTAINER_CARGO_CARCASE_MASS, ContainerCargoConstants.BIG_CONTAINER_CARGO_VOLUME, HardMaterial.COAL);
    public static final Cargo COOPER_CONTAINER_CARGO = new ContainerCargo(ContainerCargoConstants.SMALL_CONTAINER_CARGO_CARCASE_MASS,ContainerCargoConstants.BIG_CONTAINER_CARGO_VOLUME, HardMaterial.COOPER);
    public static final  Cargo FIRST_PLATFORM_CARGO = new PlatformCargo(PlatformCargoConstants.BIG_ITEM_MASS);
    public static final PassengerImpl FIRST_PASSENGER_IMPL = new PassengerImpl(PassengerConstants.FIRST_PASSENGER_NAME, PassengerConstants.FIRST_PASSENGER_MASS);
    public static final PassengerImpl SECOND_PASSENGER_IMPL = new PassengerImpl(PassengerConstants.SECOND_PASSENGER_NAME, PassengerConstants.SECOND_PASSENGER_MASS);
    public static final PassengerImpl THIRD_PASSENGER_IMPL = new PassengerImpl(PassengerConstants.THIRD_PASSENGER_NAME, PassengerConstants.THIRD_PASSENGER_MASS);

    public static final double CARRYING_CAPACITY = 50000000.0;

}
