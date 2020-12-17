package com.java.diffpackage;

import com.java.corejava.Vehicle;

public class Car extends Vehicle {

    public void brake() {
        super.brake();
        System.out.println("car brake");
    }
    public void protectedTest() {
        super.length = 10;

    }
}