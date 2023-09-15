package com.javaFundamental.variables;

public class VariablesDemo {
    int age=10;
    float salary=10000.54f;
    double highSalary=544434.09890;
    char alphabets='A';
    String name="Divyanshu";
    short digit=5;
    //Declaring many variable in same line with values
    int x = 5, y = 6, z = 50;

    public static void main(String[] args) {
        VariablesDemo variablesDemo= new VariablesDemo();
        System.out.println(variablesDemo.age);
        System.out.println(variablesDemo.salary);
        System.out.println(variablesDemo.highSalary);
        System.out.println(variablesDemo.alphabets);
        System.out.println(variablesDemo.name);
        System.out.println(variablesDemo.digit);
        System.out.println(variablesDemo.x+" "+variablesDemo.y+" "+variablesDemo.z);

    }
}
