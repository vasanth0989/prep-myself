package com.test;


import com.test.pojo.Employee;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Topic 1: Classes, Object, Object initiation, Constructors, NoArg, All Arg
        // primitive data types
        // bbcdfils - b-byte, b-boolean, c-char, d-double, f-float, i-int, l-long,s-short
        int i = 10;
        // Reference type we always need to create an instance with 'new'
        // by default you will be getting no argument constructor
        Account account = new Account();
        // All args constructor
        // Instantiating an Object
        Account account1 = new Account(1,"Checking");
        System.out.println(account1.id);
        System.out.println(account1.type);

        // Topic 2: Access modifiers
        // default, public, private and protected
        // pojo - Plain Old Java Object
        // packages and import statements
        Employee employee = new Employee();
        // Access modifiers will be applied to class, fields, methods
        // public fields are visible everywhere
        //employee.name = "Vasanth";
        // How to call fields | variables vs methods
        // You can access fields by using . operator
        //employee.name = "";
        // Calling instance method will always have the () bracket notation
        // private fields are visible only inside the class
        employee.setName("Vasanth");
        System.out.println(employee.getName());
    }
}

// default
class Account {
    public int id;
    public String type;

    //No Argument constructor
    public  Account(){}

    // All args constructor
    public Account(int id, String type){
        this.id = id;
        this.type = type;
    }
}