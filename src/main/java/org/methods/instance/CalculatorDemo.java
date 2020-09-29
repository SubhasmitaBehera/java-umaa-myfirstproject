package org.methods.instance;

import java.util.Scanner;

public class CalculatorDemo {

    public static void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers you want to add :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int addresult = x + y ;
        System.out.println("Result of addition is : "+addresult);
    }
    public void subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers you want to subtract :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int subresult = x - y;
        System.out.println("Result of Subtraction is : "+subresult);

    }

    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers you want to multiply :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int mulresult = x * y;
        System.out.println("Multiplication result is : "+mulresult);
    }

    public void division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers you want to divide :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int divresult = x / y;
        System.out.println("Division result is : "+divresult);
    }

//    public static void main(String[] args) {
//        add();
//        new CalculatorDemo();
//        multiplication();
//    }
}
