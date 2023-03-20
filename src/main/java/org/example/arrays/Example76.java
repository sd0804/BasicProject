package org.example.arrays;

// Java program to demonstrate
// Arrays.stream() method

import java.util.Arrays;

class Main98 {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To get the Stream from the array
        System.out.println("Integer Array: "
                + Arrays.stream(intArr));
    }
}
