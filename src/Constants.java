import by.gsu.epamlab.passenger.impl.PassengerImpl;
import by.gsu.epamlab.cargo.HardCargo;
import by.gsu.epamlab.material.impl.HardMaterial;
import by.gsu.epamlab.cargo.LiquidCargo;
import by.gsu.epamlab.material.impl.LiquidMaterial;

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


    public static final by.gsu.epamlab.transportation.CisternCargo WATER_CISTERN_CARGO = new by.gsu.epamlab.transportation.CisternCargo(
            Constants.CisternCargo.SMALL_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(Constants.CisternCargo.SMALL_CISTERN_CARGO_VOLUME, LiquidMaterial.WATER));
    public static final by.gsu.epamlab.transportation.CisternCargo GASOLINE_CISTERN_CARGO = new by.gsu.epamlab.transportation.CisternCargo(
            Constants.CisternCargo.MEDIUM_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(Constants.CisternCargo.MEDIUM_CISTERN_CARGO_VOLUME, LiquidMaterial.GASOLINE));
    public static final by.gsu.epamlab.transportation.CisternCargo PETROL_CISTERN_CARGO = new by.gsu.epamlab.transportation.CisternCargo(
            Constants.CisternCargo.BIG_CISTERN_CARGO_CARCASE_MASS, new LiquidCargo(Constants.CisternCargo.BIG_CISTERN_CARGO_VOLUME, LiquidMaterial.PETROL));

    public static final by.gsu.epamlab.transportation.ContainerCargo IRON_CONTAINER_CARGO = new by.gsu.epamlab.transportation.ContainerCargo(
            Constants.ContainerCargo.SMALL_CONTAINER_CARGO_CARCASE_MASS,new HardCargo(Constants.ContainerCargo.SMALL_CONTAINER_CARGO_VOLUME, HardMaterial.IRON));
    public static final by.gsu.epamlab.transportation.ContainerCargo COAL_CONTAINER_CARGO = new by.gsu.epamlab.transportation.ContainerCargo(
            Constants.ContainerCargo.MEDIUM_CONTAINER_CARGO_CARCASE_MASS, new HardCargo(Constants.ContainerCargo.MEDIUM_CONTAINER_CARGO_VOLUME,HardMaterial.COAL));
    public static final by.gsu.epamlab.transportation.ContainerCargo COOPER_CONTAINER_CARGO = new by.gsu.epamlab.transportation.ContainerCargo(
            Constants.ContainerCargo.BIG_CONTAINER_CARGO_CARCASE_MASS, new HardCargo(Constants.ContainerCargo.BIG_CONTAINER_CARGO_VOLUME, HardMaterial.COOPER));

    public static final by.gsu.epamlab.transportation.PlatformCargo FIRST_PLATFORM_CARGO = new by.gsu.epamlab.transportation.PlatformCargo(
            Constants.PlatformCargo.IRON_CARGO, Constants.PlatformCargo.COAL_CARGO, Constants.PlatformCargo.WATER_CARGO);

    public static final PassengerImpl FIRST_PASSENGER_IMPL = new PassengerImpl(PassengerConstants.FIRST_PASSENGER_NAME, PassengerConstants.FIRST_PASSENGER_MASS);
    public static final PassengerImpl SECOND_PASSENGER_IMPL = new PassengerImpl(PassengerConstants.SECOND_PASSENGER_NAME, PassengerConstants.SECOND_PASSENGER_MASS);
    public static final PassengerImpl THIRD_PASSENGER_IMPL = new PassengerImpl(PassengerConstants.THIRD_PASSENGER_NAME, PassengerConstants.THIRD_PASSENGER_MASS);

    public static final double CARRYING_CAPACITY = 50000000.0;

}
