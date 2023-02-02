package org.example;

public class Truck extends Vehicle{
    int wheels = 8;
    String color = "Grey";
    double speed = 12.88;

    @Override
    void drive() {
        System.out.println("this truck drives on land with cargo");
    }
}
