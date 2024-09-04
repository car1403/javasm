package oop1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.go();
        car.brake();

        Car car2 = new Car(100,"My Car", "red");
        System.out.println(car2);
        car2.go();
        car2.brake();
    }
}
