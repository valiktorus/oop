import by.gsu.epamlab.cargotransportation.CisternCargoTransportation;
import by.gsu.epamlab.cargotransportation.ContainerCargoTransportation;
import by.gsu.epamlab.passenger.Passenger;
import by.gsu.epamlab.cargotransportation.PlatformCargoTransportation;
import by.gsu.epamlab.cargo.HardCargo;
import by.gsu.epamlab.cargo.HardMaterial;
import by.gsu.epamlab.cargo.LiquidCargo;
import by.gsu.epamlab.cargo.LiquidMaterial;

public class Constants {
    public class CisternCargo{
        public static final double SMALL_CISTERN_CARGO_VOLUME = 180;
        public static final double MEDIUM_CISTERN_CARGO_VOLUME = 280;
        public static final double BIG_CISTERN_CARGO_VOLUME = 380;
        public static final double SMALL_CISTERN_CARGO_CARCASE_MASS = 1000;
        public static final double MEDIUM_CISTERN_CARGO_CARCASE_MASS = 2000;
        public static final double BIG_CISTERN_CARGO_CARCASE_MASS = 3000;
    }
    public class ContainerCargo {
        public static final double SMALL_CONTAINER_CARGO_VOLUME = 200;
        public static final double MEDIUM_CONTAINER_CARGO_VOLUME = 300;
        public static final double BIG_CONTAINER_CARGO_VOLUME = 400;
        public static final double SMALL_CONTAINER_CARGO_CARCASE_MASS = 1000;
        public static final double MEDIUM_CONTAINER_CARGO_CARCASE_MASS = 2000;
        public static final double BIG_CONTAINER_CARGO_CARCASE_MASS = 3000;
    }

    public static class PlatformCargo{
        public static final HardCargo IRON_CARGO = new HardCargo(500, HardMaterial.IRON);
        public static final HardCargo COAL_CARGO = new HardCargo(250, HardMaterial.COAL);
        public static final LiquidCargo WATER_CARGO = new LiquidCargo(600, LiquidMaterial.WATER);
    }

    public class PassengerConstants{
        public static final String FIRST_PASSENGER_NAME = "Mike";
        public static final String SECOND_PASSENGER_NAME = "Peter";
        public static final String THIRD_PASSENGER_NAME = "Robert";
        public static final double FIRST_PASSENGER_MASS = 75;
        public static final double SECOND_PASSENGER_MASS = 83;
        public static final double THIRD_PASSENGER_MASS = 90;
    }


    public static final CisternCargoTransportation WATER_CISTERN_CARGO = new CisternCargoTransportation(
            CisternCargo.SMALL_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(CisternCargo.SMALL_CISTERN_CARGO_VOLUME, LiquidMaterial.WATER));
    public static final CisternCargoTransportation GASOLINE_CISTERN_CARGO = new CisternCargoTransportation(
            CisternCargo.MEDIUM_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(CisternCargo.MEDIUM_CISTERN_CARGO_VOLUME, LiquidMaterial.GASOLINE));
    public static final CisternCargoTransportation PETROL_CISTERN_CARGO = new CisternCargoTransportation(
            CisternCargo.BIG_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(CisternCargo.BIG_CISTERN_CARGO_VOLUME, LiquidMaterial.PETROL));

    public static final ContainerCargoTransportation IRON_CONTAINER_CARGO = new ContainerCargoTransportation(
            ContainerCargo.SMALL_CONTAINER_CARGO_CARCASE_MASS,new HardCargo(ContainerCargo.SMALL_CONTAINER_CARGO_VOLUME, HardMaterial.IRON));
    public static final ContainerCargoTransportation COAL_CONTAINER_CARGO = new ContainerCargoTransportation(
            ContainerCargo.MEDIUM_CONTAINER_CARGO_CARCASE_MASS, new HardCargo(ContainerCargo.MEDIUM_CONTAINER_CARGO_VOLUME,HardMaterial.COAL));
    public static final ContainerCargoTransportation COOPER_CONTAINER_CARGO = new ContainerCargoTransportation(
            ContainerCargo.BIG_CONTAINER_CARGO_CARCASE_MASS, new HardCargo(ContainerCargo.BIG_CONTAINER_CARGO_VOLUME, HardMaterial.COOPER));

    public static final PlatformCargoTransportation FIRST_PLATFORM_CARGO = new PlatformCargoTransportation(
            PlatformCargo.IRON_CARGO, PlatformCargo.COAL_CARGO, PlatformCargo.WATER_CARGO);

    public static final Passenger FIRST_PASSENGER = new Passenger(PassengerConstants.FIRST_PASSENGER_NAME, PassengerConstants.FIRST_PASSENGER_MASS);
    public static final Passenger SECOND_PASSENGER = new Passenger(PassengerConstants.SECOND_PASSENGER_NAME, PassengerConstants.SECOND_PASSENGER_MASS);
    public static final Passenger THIRD_PASSENGER = new Passenger(PassengerConstants.THIRD_PASSENGER_NAME, PassengerConstants.THIRD_PASSENGER_MASS);

    public static final double CARRYING_CAPACITY = 50000000.0;

}
