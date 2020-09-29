package org.methods.instance;

import org.methods.instance.CalculatorDemo;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorDemo cal = new CalculatorDemo();
        cal.subtract();
        cal .division();

        cal = null ;

        cal.addition();
        cal.multiplication();



    }
}
