public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2021, "Lexus LC");
        for (int i = 0 ; i < 10 ; i++){
            car1.accelerate();
        }
        for (int i = 0; i < 5 ; i++){
            car1.brake();
        }
        System.out.println(car1);
    }
}