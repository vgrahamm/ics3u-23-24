package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car jeep = new Car("Jeep", "Cherokee", 2023, 1500);
        Car smallCar = new Car("Hyundai", "Kona", 2022, 11080);

        smallCar.drive(1500);
        jeep.printCarInfo();
    }
}
