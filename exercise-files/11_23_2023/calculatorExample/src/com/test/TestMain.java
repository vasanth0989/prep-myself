package com.test;

public class TestMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("Super Awesome Calculator");
        calculator.setName("Simple Calculator");
        int sum = calculator.add(5,5);
        System.out.println("Sum:"+sum);
        int sub = calculator.subtract(10, 5);
        System.out.println("Sub:"+sub);
        int mul = calculator.multiply(4,5);
        System.out.println("multiply:"+mul);
        // Methods within String
        String calName = calculator.getName();
        String calUpperCase = calName.toUpperCase();
        System.out.println("CalUpperCase:"+calUpperCase);
        String calLowerCase = calName.toLowerCase();
        System.out.println("CalLowerCase:"+calLowerCase);
        System.out.println("These are the results form "+calculator.getName());



    }
}
