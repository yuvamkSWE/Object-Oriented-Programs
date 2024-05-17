public class Main {
    public static void main(String[] args) {

        FuelGauge fuelGauge1 = new FuelGauge(0);
        Odometer odometer1 = new Odometer(0 , fuelGauge1);

        System.out.println("Fueling up the car.");

        for (int i = 0 ; i < 15 ; i++){
            fuelGauge1.increaseFuel();
        }
        System.out.println(fuelGauge1);

        System.out.println("Driving for 48 miles.");

        for (int i = 0 ; i < 48; i++){
            odometer1.increaseMileage();
        }

        System.out.println(odometer1);

    }
}