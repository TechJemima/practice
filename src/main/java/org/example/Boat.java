package org.example;

public class Boat extends Vehicle {
    int whees = 0;
    String color = "orange";
    double speed = 22.55;



    @Override
    void start() {
        System.out.println("this boat starts moving late in the morning and on water");

    }
}
