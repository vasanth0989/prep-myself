package com.test1;

public class TestMain {

    public static void main(String[] args) {
     Animal dog = new Dog();
     dog.eat();
     // this errors out
//     /dog.bark();

     Dog dog1 = new Dog();
     dog1.eat();
     dog1.bark();

    }
}
