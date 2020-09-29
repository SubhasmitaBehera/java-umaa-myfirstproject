package org.blocks;

public class Static_NonStaticBlock {
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
        new Static_NonStaticBlock();
        System.out.println("Normal statement in Main method...");
        new Static_NonStaticBlock();
    }
}
