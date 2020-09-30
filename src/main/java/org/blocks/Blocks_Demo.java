package org.blocks;

public class Blocks_Demo {
    static int a;

    static {
        System.out.println("This is a Static Block...");
    }

    {
        System.out.println("This is an Instance Block... ");
        if (a == 0){
            System.out.println("This is an If Block...");
        }
    }

    public static void main(String[] args) {

        new Blocks_Demo();

        System.out.println("Length = " + args.length);
        if (args.length == 0){
            System.out.println("Adding array index :");
            args = new String[10];
            args[0] = "Subhasmita";
            args[1] = "Sangita";
            args[2] = "Ritu";
            args[3] = "Kathanee";
        }
        System.out.println("Array 1st index value "+args[0]);
        System.out.println("Array 2nd index value "+args[1]);
        System.out.println("Array 33d index value "+args[2]);
        System.out.println("Array 5th index value "+args[5]);
    }
}
