package org.oops.inheritance.scenarios;

public class Test12 {
    public static void main(String[] args) {

    }

    // inheritance: parent class having param constructor. child having param constructor
    // fix: invoke parent param constructor from child constructor
    public static class Parent
    {
        private int i;

        public Parent(int i) {
            this.i = i;
        }
        // no default constructor here
    }

    public static class Child extends Parent
    {
        // fix: param constructor
        public Child(int i) {
            super(i); // it is just call to parent class param constructor. no new object creation.
        }
    }
}