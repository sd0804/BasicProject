package org.example.reflection;

// Java Program to Demonstrate Working of newInstance()
// Method present inside java.lang.Class

// Class 1
// Class 2
class A {
    int a;
}
class B {
    int b;
}

// Class 3
// Main class
class GFG {

    // Method 1
    // To create an instance of class whose name is
    // passed as a string 'c'.
    public static void fun(String c)
            throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException
    {

        // Creating an object of type 'c'
        Object obj = Class.forName(c).newInstance();

        // Printing the type of object created
        System.out.println("Object created for class:"
                + obj.getClass().getName());
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
            throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException
    {

        // Calling above method over "A"
        fun("A");
    }
}
