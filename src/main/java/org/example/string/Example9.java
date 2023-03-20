package org.example.string;

// Java Program to demonstrate Immutable String in Java

import java.io.*;

class GFG3 {
    public static void main(String[] args)
    {
        String s = "Sachin";

        // concat() method appends
        // the string at the end
        s.concat(" Tendulkar");

        // This will print Sachin
        // because strings are
        // immutable objects
        System.out.println(s);
    }
}
