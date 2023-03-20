package org.example.arrays;

// Java Program to Demonstrate Arrays Class
// Via binarySearch() method

// Importing Arrays utility class
// from java.util package
import java.util.Arrays;

// Main class
 class GFG4 {

    // Main driver method
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        // Print the key and corresponding index
        System.out.println(
                intKey + " found at index = "
                        + Arrays.binarySearch(intArr, intKey));
    }
}

