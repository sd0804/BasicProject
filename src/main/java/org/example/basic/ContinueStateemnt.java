package org.example.basic;

// Java program to illustrate using
// continue in an if statement
import java.util.*;

class ContinueDemo {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}

