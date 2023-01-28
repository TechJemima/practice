package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.fast();
        car.stop();
        System.out.println(car.color);
        System.out.println(car.wheels);
        System.out.println(car.speed);

        Truck truck = new Truck();
        truck.stop();

        System.out.println(truck.speed);
        System.out.println(truck.color);


        Boat boat = new Boat();
        boat.start();

        Vehicle [] travels = {car,truck,boat};


    }
}