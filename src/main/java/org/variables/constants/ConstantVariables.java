package org.variables.constants;

public class ConstantVariables {

    // constants initialized only once. cant be modified.
    static final String staticConstant; // class constants
    final int age = 60; // object or instance constants
    static {
        staticConstant = "Some static value";
        // staticConstant = "Some static value modified";
    }

    {
//        int age = 15; // duplicate initialization of final variable
//        int age = 55;
    }

    public static void main(String[] args) {
        System.out.println(staticConstant);   //Some static value
        ConstantVariables constantVariables = new ConstantVariables();
        System.out.println(constantVariables.age);   //60
        constantVariables.sum(15, 55);    //Sum of x & y: 70

        int data = 650;
        final int marks = 84;
        System.out.println(data);     //650
        System.out.println(marks);     //84
    }

    public void sum(final int x, final int y)
    {
//          x = 34;
        final int result = x + y;
        // result = 70;
        System.out.println("sum of x & y: "+result);
    }
}
