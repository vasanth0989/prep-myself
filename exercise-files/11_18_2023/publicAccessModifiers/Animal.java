package com.test1;

public class Animal {

    private boolean herbivores;
     private int age;
    private String name;

    //constructor - noArgument
    // Argument constructor
    public Animal(boolean herbivores, int age, String name){
        this.herbivores = herbivores;
        this.age = age;
        this.name = name;
    }
    //setters and getters are called as instance methods
    //getter method
    public int getAge(){
        // method body;
        return this.age;
    }
    //setter
    public void setAge(int age){
        this.age = age;
    }


}
