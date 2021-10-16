package com.mycompany.myfirstproject;

public class Hello {
    
    public static void main(String args[]) {
        System.out.println("Hello Java");
        
        myMethod();
    }

    private static void myMethod() {
        int a = 123;
        int b = 456;
        
        System.out.println(String.format("a = %d | b = %d", a, b));
    }
    
}
