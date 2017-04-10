import by.gsu.epamlab.Ferry;
import by.gsu.epamlab.FerryComparator;

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
                Constants.FIRST_PASSENGER,
                Constants.SECOND_PASSENGER,
                Constants.THIRD_PASSENGER
        );
        ferry.printTransportables();

        Arrays.sort(ferry.getTransportables(), new FerryComparator());

        ferry.printTransportables();

        System.out.println(ferry.isPassed() ? "A ferry can transport cargo" : "A ferry can not transport cargo");
    }
}
