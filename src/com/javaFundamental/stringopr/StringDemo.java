package com.javaFundamental.stringopr;

public class StringDemo {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //txt.length() method is used for checking the length of a string.
        System.out.println("MThe length of the txt string is: " + txt.length());
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        String txts = "Please locate where 'locate' occurs!";
        System.out.println(txts.indexOf("locate")); // Outputs 7
    }
}
