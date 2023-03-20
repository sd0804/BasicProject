package org.example.inheritance;

// Java program to demonstrate How Diamond Problem
// Is Handled in case of Default Methods

// Interface 1
interface GPI {

    // Default method
    default void show()
    {

        // Print statement
        System.out.println("Default GPI");
    }
}

// Interface 2
// Extending the above interface
interface PI11 extends GPI {
}

// Interface 3
// Extending the above interface
interface PI21 extends GPI {
}

// Main class
// Implementation class code
class TestClass1 implements PI11, PI21 {

    // Main driver method
    public static void main(String args[])
    {

        // Creating object of this class
        // in main() method
        TestClass1 d = new TestClass1();

        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();
    }
}

