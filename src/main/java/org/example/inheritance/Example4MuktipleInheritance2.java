package org.example.inheritance;

// Java Program to Illustrate Unsupportance of
// Multiple Inheritance
// Diamond Problem Similar Scenario

// Importing input output classes

// Class 1
// A Grand parent class in diamond
class GrandParent {

    void fun() {

        // Print statement to be executed when this method is called
        System.out.println("Grandparent");
    }
}

// Class 2
// First Parent class
class Parent3 extends GrandParent {
    void fun() {

        // Print statement to be executed when this method is called
        System.out.println("Parent1");
    }
}

// Class 3
// Second Parent Class
class Parent4 extends GrandParent {
    void fun() {

        // Print statement to be executed when this method is called
        System.out.println("Parent2");
    }
}

// Class 4
// Inheriting from multiple classes
//class Test4 extends Parent3, Parent4 {
//
//    // Main driver method
//    public static void main(String args[]) {
//
//        // Creating object of this class i main() method
//        Test4 t = new Test4();
//
//        // Now calling fun() method from its parent classes
//        // which will throw compilation error
//        t.fun();
//    }
//}

