package com.java.corejava;


public class Vehicle {

    private String Name;
    private String colour;
    int weight;
    protected int length;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void drive() {
        System.out.println("drive the car");
    }

    public void brake() {
        System.out.println("press the brake");
    }

}

class  test  {
    public void accessSpecifiersTest() {
        Vehicle car = new Vehicle();
        car.length = 10;
        car.weight = 20;
    }
}

