package oop2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("k1", "red", 50, 10);
        car1.addFuel(30);
        System.out.println(car1);
        car1.go(275);
        car1.brake();
    }
}
