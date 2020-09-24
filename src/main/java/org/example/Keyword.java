package org.example;

public class Keyword {
    static int a;
    static{
        a = 10;
        System.out.println("Static Block...");
    }

    {
        System.out.println("Non Static Block...");
        int result = a+a;
        System.out.println("Result = " +result);
    }

    public static void main(String[] args) {
        new Keyword();
        System.out.println("Normal statement in Main method...");
        new Keyword();
    }
}
