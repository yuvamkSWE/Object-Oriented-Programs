public class ProductionWorker extends  Employee{
    public double hourlyRate;
    public int shift;
    public ProductionWorker(String name , String hireDate, String employeeNumber, double hourlyRate , int shift){
        super(name, hireDate , employeeNumber);
        this.hourlyRate = hourlyRate;
        this.shift = shift;
    }


    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getShift() {
        return shift;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductionWorker{" +
                "hourlyRate=" + hourlyRate +
                ", shift=" + shift +
                '}';
    }
}
