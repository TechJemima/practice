package org.example;

public class Car extends Vehicle {

    int wheels = 4;
    String color = "White";
    double speed = 28.99;

    @Override
    void drive() {
        System.out.println("This car drives with 4 passengers on land");
    }
    //void stop() {
     //   System.out.println("this vehicle does not stop frequently");
    }
//}
