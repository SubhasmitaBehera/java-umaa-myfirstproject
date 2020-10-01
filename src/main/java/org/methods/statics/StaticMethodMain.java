package org.methods.statics;

public class StaticMethodMain {

    static int x = 100; // static variable
    int y = 20; // instance variable

    static {
        System.out.println("Static Block message...");
        welcomeCustomer("Ritu Gupta");
        String fullName = getFullName("Subhasmita", "Behera");
        System.out.println(fullName);
    }

    static {
        System.out.println("Static variables executing...");
        System.out.println(x);
//         System.out.println(y); // Compilation Error: Non-static field 'y' cannot be referenced from a static context
//          System.out.println(z); //Illegal forward reference because z is defined later on line 22

    }

    {

        System.out.println(x);
    }
    //we can refer static variable in non-static block but we cann't refer nonstatic variable in static block.
      //

    static int z = 300;

    public static void main(String[] args) {
        display();
        display();
        display(5, 10);
        display(50, 100);
        welcomeCustomer();
        welcomeCustomer("Bibhuprasad Dash");
        welcomeCustomer("Sangita Mahanta");
        int summation = sum(10, 20);
        System.out.println(summation);
        String fullName = getFullName("Amit", "Kumar");
        System.out.println(fullName);
    }

    static String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    static void display(int x, int y) {
        int res = x / y;
        System.out.println(res);


    }

    // 1. return type is void. no params
    static // says it is a static method
    void // the return type
    display // methodName: valid indentifier
    () // parameters are optional here
    { // starting method body

        System.out.println("display-1");// duplicate: CTRl D
        System.out.println("display-1");// duplicate: CTRl D
        System.out.println("display-1");// duplicate: CTRl D
        System.out.println("display-1");// remove: CTRl Y

    } // ending method body

    static void welcomeCustomer() {
        // hardcoded
        System.out.println("Welcome customer to our shop: Kathanee Kausik...");
    }

    static void welcomeCustomer(String name) {
        // hardcoded
        System.out.println("Welcome customer to our shop: " + name);
    }
}
