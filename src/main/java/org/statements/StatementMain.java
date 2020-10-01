package org.statements;

import java.util.Scanner;

public class StatementMain {

    public static void main(String[] args) {

        //Declaration statements
        String name = "Subhasmita";  // name is a variableName whose type is String
        int mark = 76;   // marks is variableName whose type is int
        System.out.println("Name : " + name);
        System.out.println("Mark : " + mark);

        // expression statements: calculation
        int a = 10;
        int b = 20;
        int add = a + b; // calculation with addition operator +
        System.out.println("Addition of 10 and 20 = " + add);

        // control statements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yor age :- ");
        int age = sc.nextInt();
        if( age >= 18)
        {
            System.out.println("you are elligible to vote in the election...");
        }
        else{
            System.out.println("you are not elligible to vote in the election!!!");
        }
    }
}
