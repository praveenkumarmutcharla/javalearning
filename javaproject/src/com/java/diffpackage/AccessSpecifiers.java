package com.java.diffpackage;

import com.java.corejava.Methods;

public class AccessSpecifiers extends Methods {  // Methods is super class
    Methods methods = new Methods();

    public void protectedTest() {
        methods.classVar = 10;
        super.var3 = 20;
        super.setVar2(30); // super can access super class(Methods class) private variables through its methods
    }
}
