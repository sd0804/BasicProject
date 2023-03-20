package org.example.serialization;

import java.io.*;

// Java program to illustrate Implementation of
// User-defined SerialVersionUID

// Main class
// // Geeks which contains two variable which
// are going to Serialize to
// Illustrate Implementation of Serializable Interface
class Geeks implements Serializable {

    // User-defined SerialVersionUID
    // Custom initialization
    private static final long SerialVersionUID = 10l;
    int i = 10;
    int j = 20;
}

// Java program to illustrate
// implementation of User-defined
// SerialVersionUID

// Importing required classes


// Sender side class which is going to Serialize object
class Sender {

    // Main driver method
    public static void main(String[] args) throws IOException {
        // Creating object of class Random class which
        // contains two variables which are going to
        // Serialize In simpler words , object of class
        // 'Geeks'
        Geeks g = new Geeks();

        // Here xyz.txt is the file name where the object is
        // going to serialize
        FileOutputStream fos
                = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);

        oos.writeObject(g);
    }
}


