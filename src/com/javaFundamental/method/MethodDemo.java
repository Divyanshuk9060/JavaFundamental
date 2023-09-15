package com.javaFundamental.method;

public class MethodDemo {
    //addingTwoNumber(int num1, int num2) is a custom method taking 2 input parameter and returning its sum
    int addingTwoNumber(int num1, int num2){
        int sum=0;
        sum= sum+num1+num2;
        return sum;
    }

    //main() is the static method available in java
    public static void main(String[] args) {
        MethodDemo methodDemo= new MethodDemo();
        System.out.println(methodDemo.addingTwoNumber(4,6));

    }
}
