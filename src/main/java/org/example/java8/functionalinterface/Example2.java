package org.example.java8.functionalinterface;

// Java program to demonstrate Implementation of
// functional interface using lambda expressions

class Test1 {
    public static void main(String args[])
    {

        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();

        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}
