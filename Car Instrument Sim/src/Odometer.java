public class Odometer {
    private double mileage;
    private FuelGauge fuelGauge;
    private int count; // Moved count variable to the class level

    public Odometer(double mileage, FuelGauge fuelGauge){
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
        this.count = 0; // Initialize count to 0
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void increaseMileage(){
        if (mileage < 999999) {
            mileage++;
            count++;
        } else {
            mileage = 0;
        }

        if (count % 24 == 0){
            fuelGauge.decreaseFuel();
            count = 0; // Reset count to 0 after decrementing fuel every 24 miles
        }
    }

    @Override
    public String toString() {
        return "Odometer{" +
                "mileage=" + mileage +
                ", fuelGauge=" + fuelGauge +
                '}';
    }
}
