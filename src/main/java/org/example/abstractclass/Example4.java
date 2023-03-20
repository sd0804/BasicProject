package org.example.abstractclass;

// Java Program to illustrate Abstract class
// Without any abstract method

// Class 1
// An abstract class without any abstract method
abstract class Base3 {

    // Demo method. This is not an abstract method.
    void fun()
    {
        // Print message if class 1 function is called
        System.out.println("Function of Base class is called");
    }
}

// Class 2
class Derived3 extends Base3 {
//This class only inherits the Base class methods and properties

}

// Class 3
class Main {

    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        Derived3 d = new Derived3();

        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
    }
}
