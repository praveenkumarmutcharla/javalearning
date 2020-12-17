package com.java.corejava;

public class Methods {

    // class will have both attributes and methods
    // Access specifiers default private public protected
    // class variables(attributes) can be accessed through object


    public int classVar;
    private int var2;
    protected int var3;


    public void setClassVar(int var) {  // public is access specifier void return type var is method parameter
        int methodScopevar  = 10;
        this.classVar = var;
        System.out.println(" method scope  variable "+methodScopevar);
        System.out.println(" class scope  variable "+classVar);
    }

    public int getClassVar() {
        return  this.classVar;
    }

    public void setVar2(int var) {  // public is access specifier void return type var is method parameter
        this.var2 = var;
    }

    public int getVar2() {
        return  this.var2;
    }

    public void setVar3(int var) {  // public is access specifier void return type var is method parameter
        this.var3= var;
    }

    public int getVar3() {
        return  this.var3;
    }


}
class secondclass {

    Methods method = new Methods();
    public void accessSpecifiersTest() {
        method.classVar = 100;
        method.setVar2(10);
        method.var3 = 100;
    }
}