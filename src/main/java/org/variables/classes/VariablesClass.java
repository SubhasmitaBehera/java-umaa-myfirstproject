package org.variables.classes;

public class VariablesClass {

    public static int ageOfStudent; // static
    public String nameOfStudent; // non-static

    public static int rankOfStudent = 34;
    public String nativePlaceOfStudent = "Kendrapara";

    public static int x;
    public String y;

    static {

        x = 100;
        System.out.println("Static value init inside static block , x = "+x);

    }

    {
        System.out.println("Non static variable(non-primitive) with default refrence value , NAME OF STUDENT : "+nameOfStudent);
        System.out.println("Non static variable(non-primitive) with initialized value , NATIVE PLACE OF STUDENT : "+ nativePlaceOfStudent);

         y = "Some string value";

        System.out.println("Non static value init inside non-static block , y = "+y);
    }

    public static void main(String[] args) {
        System.out.println("static variable (primitive) with default value, AGE : "+ageOfStudent);
        System.out.println("static variable (primitive) with initialized value , RANK : "+rankOfStudent);
        VariablesClass variablesClass =  new VariablesClass();
        variablesClass.m2(); // non-static method
        m1();// static method
    }

    static void m1()
    {
        x = 200;
        System.out.println("init of x inside static method , x = "+x);
    }

    void m2()// non-static
    {
         x = 300;  // static resource
        y = "Some value in method";
        System.out.println("Init of y inside non-static method , y = "+y);
    }

    public VariablesClass()
    {
        x = 400;
        y = "Some value inside constructor";

        System.out.println("Inside constructor: x "+x);
        System.out.println("Inside constructor: y "+y);

    }
}
