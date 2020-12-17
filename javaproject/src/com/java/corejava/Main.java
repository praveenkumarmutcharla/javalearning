package com.java.corejava;


import java.util.ArrayList;
import java.util.List;

import com.java.diffpackage.Car;

public class Main {
    public static void main(String args[]){

       /* Vehicle car = new Vehicle();
        car.setWeight(10);
        car.length = 20; //private access specifier
        car.setLength(30);
        car.weight  = 30; // default specifier
        System.out.println(car.getLength());
        Car bmw = new Car();
        bmw.brake();


        // Method overriding
        SBI s=new SBI();
        ICICI icc=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+icc.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());*/


        // loops for while do-while foreach

        Methods methodsObj = new Methods();
        methodsObj.setClassVar(10000);
        int returnedElement = methodsObj.getClassVar();
        System.out.println("returnedElement "+ returnedElement);



    }
}
