public class FuelGauge {
    private double fuelInGallons ;

    public FuelGauge(double fuelInGallons){
        this.fuelInGallons = fuelInGallons;
    }

    public void setFuelInGallons(double fuelInGallons) {
        this.fuelInGallons = fuelInGallons;
    }

    public double getFuelInGallons() {
        return fuelInGallons;
    }
    public void increaseFuel(){

        fuelInGallons = (fuelInGallons >= 0 && fuelInGallons < 15) ? ++fuelInGallons : fuelInGallons;

    }

    public void decreaseFuel(){
        if (fuelInGallons > 0){
            fuelInGallons--;
        }
    }

    @Override
    public String toString() {
        return "FuelGauge{" +
                "fuelInGallons=" + fuelInGallons +
                '}';
    }
}
