import by.gsu.epamlab.ferry.Ferry;
import by.gsu.epamlab.transportation.TransportableComparator;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Ferry ferry = new Ferry(Constants.CARRYING_CAPACITY,
                Constants.WATER_CISTERN_CARGO,
                Constants.GASOLINE_CISTERN_CARGO,
                Constants.PETROL_CISTERN_CARGO,
                Constants.IRON_CONTAINER_CARGO,
                Constants.COAL_CONTAINER_CARGO,
                Constants.COOPER_CONTAINER_CARGO,
                Constants.FIRST_PLATFORM_CARGO,
                Constants.FIRST_PASSENGER_IMPL,
                Constants.SECOND_PASSENGER_IMPL,
                Constants.THIRD_PASSENGER_IMPL
        );
        ferry.printTransportables();

        Arrays.sort(ferry.getTransportables(), new TransportableComparator());

        ferry.printTransportables();

        System.out.println(ferry.isPassed() ? "A ferry can transport cargo" : "A ferry can not transport cargo");
    }
}
