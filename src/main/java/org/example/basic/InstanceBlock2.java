package org.example.basic;

// Java program to illustrate
// execution of multiple
// Instance Initialization Blocks
// in one program
class GfG8 {
    // Instance Initialization Block - 1
    {
        System.out.println("IIB1 block");
    }

    // Instance Initialization Block - 2
    {
        System.out.println("IIB2 block");
    }

    // Constructor of class GfG
    GfG8() { System.out.println("Constructor Called"); }

    // Instance Initialization Block - 3
    {
        System.out.println("IIB3 block");
    }

    // main function
    public static void main(String[] args)
    {
        GfG a = new GfG();
    }
}
