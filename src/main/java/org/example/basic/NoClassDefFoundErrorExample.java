package org.example.basic;

// Java Program to Illustrate NoClassDefFoundError Exception

// Class 1
// Helper class
class GeeksForGeeks {

    // Method
    void greeting()
    {
        // Print statement whenever method is called
        System.out.println("hello!");
    }
}

// Class 2
// Main class
class GFG45 {

    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 1
        // inside main() in class2
        GeeksForGeeks geeks = new GeeksForGeeks();

        // Calling method of above class
        geeks.greeting();
    }
}
