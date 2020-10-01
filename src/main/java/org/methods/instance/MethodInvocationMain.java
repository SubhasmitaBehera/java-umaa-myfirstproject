package org.methods.instance;

public class MethodInvocationMain {

    static{

        System.out.println("Static Block Statement1...");
        var2();
        MethodInvocationMain var = new MethodInvocationMain();// this will create an object to execute non-static block
        var.var1();   //to call non-static method we have to call through object
        System.out.println("Static Block Statement2...");
    }

    {
        System.out.println("Non-Static Block Statement1...");
        var1();
        var2();
        System.out.println("Non-Static Block Statement2...");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Statement1...");
        var2();
        MethodInvocationMain obj = new MethodInvocationMain();// non-static block execution
        obj.var1();
        System.out.println("Main Method Statement2...");
    }

    void var1()
    {
        System.out.println("Non-Static Method var1()...");
    }

    static void var2()
    {
        System.out.println("Static Method var2()...");
    }

}
