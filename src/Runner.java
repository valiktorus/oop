import by.gsu.epamlab.Ferry;

public class Runner {
    public static void main(String[] args) {
        Ferry ferry = new Ferry(50000.0,
                Constants.WATER_CISTERN_CARGO,
                Constants.GASOLINE_CISTERN_CARGO,
                Constants.IRON_CONTEINER_CARGO,
                Constants.PETROL_CISTERN_CARGO);
        ferry.printTransportables();
    }
}
