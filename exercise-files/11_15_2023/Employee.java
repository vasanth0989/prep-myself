package com.test.quiz;

class Employee {
    private String name;
    private int age;
    private double salary;

    private boolean fullTime;
    // NoArgument Constructor
    public Employee() {
    }
    // All Argument Constructor
    public Employee (String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
    }

    //getters
    public String getName() {
        return name;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class TestMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "";
        System.out.println("Age:"+employee.getAge());
        System.out.println("Salary:"+employee.getSalary());
        System.out.println("FullTime:"+employee.isFullTime());
        System.out.println("Name:"+employee.getName());

        // Instantiating or creating an Object
        // You use constructor to create an Object
        Employee employee1 = new Employee("Vasanth", 33, 252.2d);
        System.out.println("Before"+employee1.getName());
        employee1.setName("John");
        System.out.println("After:"+employee1.getAge());
    }
}