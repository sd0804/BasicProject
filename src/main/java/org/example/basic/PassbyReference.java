package org.example.basic;

class Example65 {

    /*
     *  The original value of 'a' will be changed as we are trying
     *  to pass the objects. Objects are passed by reference.
     */

    int a = 10;
    void call(Example65 eg) {
        eg.a = eg.a+10;
    }

    public static void main(String[] args) {

        Example65 eg = new Example65();
        System.out.println("Before call-by-reference: " + eg.a);

        // passing the object as a value using pass-by-reference
        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.a);


    }
}
