package org.blocks;

public class Static_NonStaticBlock {
    static int a;
    static{
        a = 10;
        System.out.println("This is Static Block...");
    }

    {
        System.out.println("This is Non Static Block...");
        int result = a+a;
        System.out.println("Result = " +result);
    }

    public static void main(String[] args) {
        new Static_NonStaticBlock();
        System.out.println("This is normal statement in Main method...");
        a = 20;
        new Static_NonStaticBlock();
    }
}
