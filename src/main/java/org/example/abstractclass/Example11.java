package org.example.abstractclass;

/*package whatever //do not write package name here */

import java.io.*;
abstract class Demo1 {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class FirstChild1 extends Demo1 {
    public void m1() {
        System.out.println("Inside m1");
    }
}

class SecondChild1 extends FirstChild1 {
    public void m2() {
        System.out.println("Inside m2");
    }
    public void m3() {
        System.out.println("Inside m3");
    }
}
class GFG56 {
    public static void main(String[] args)
    {
        // if we remove the abstract keyword from FirstChild
        // Class and uncommented below obj creation for
        // FirstChild then it will throw
        // compile time error as did't override all the
        // abstract methods

        // FirstChild f=new FirstChild();
        // f.m1();

        SecondChild1 s = new SecondChild1();
        s.m1();
        s.m2();
        s.m3();
    }
}

