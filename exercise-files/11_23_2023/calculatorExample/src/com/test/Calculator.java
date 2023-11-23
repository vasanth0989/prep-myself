package com.test;

public class Calculator {

    private String name;

    //no-arg-constructor
    public Calculator() {}

    // Argument constructor
    public Calculator(String name){
        this.name = name;
    }
    //methods
    public int add(int num1, int num2){
        return num1 + num2;
    }
    //multiply
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int subtract(int num1, int num2){
     return  num1 - num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
