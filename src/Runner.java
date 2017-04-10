import by.gsu.epamlab.ferry.Ferry;
import by.gsu.epamlab.transportation.TransportableComparator;
import by.gsu.epamlab.util.TransportableUtil;

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
        TransportableUtil.printTranspotrable(ferry.getTransportables());

        Arrays.sort(ferry.getTransportables(), new TransportableComparator());

        TransportableUtil.printTranspotrable(ferry.getTransportables());

        System.out.println(ferry.isPassed() ? "A ferry can transport cargo" : "A ferry can not transport cargo");
    }
}
