package org.example.basic;

// Java Program to Illustrate Execution of Static Block
// Before Constructors

// Class 1
// Helper class
class Test1 {

    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    // Case 3: Static blocks
    static
    {
        i = 10;
        System.out.println("static block called ");
    }

    // Constructor calling
    Test1() { System.out.println("Constructor called"); }
}

// Class 2
// Main class
class GFG9{

    // Main driver method
    public static void main(String args[])
    {

        // Although we have two objects, static block is
        // executed only once.
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
    }
}

