package org.blocks;

public class StaticNonStaticDemo {

    // static blocks: class gets loaded
    // one time activity per class without having object of the class.
    static int x;
    static {
        // static variables. static methods
        System.out.println("static statement1");
        System.out.println(x);
        x = 10;
    }

    static {
        System.out.println("static statement2");
        System.out.println(x);
    }

    // non-static blocks
    // 100 of non static blocks
    {
        System.out.println("Non Static Statement1...");
        if( x == 0)
        {
            System.out.println("invalid value of x!!!");
        }
    }

    {
        System.out.println("Non Static Statement2...");
    }

    public static void main(String[] args) {

        System.out.println("This is main method ...");
        new StaticNonStaticDemo();
        new StaticNonStaticDemo();
    }

    public StaticNonStaticDemo() {
        System.out.println("This is the constructor...");
    }
}