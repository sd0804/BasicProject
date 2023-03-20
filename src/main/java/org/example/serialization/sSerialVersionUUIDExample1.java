package org.example.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Receiver {

    // main driver method
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Here xyz.txt is the file name where the object is
        // going to Deserialized
        FileInputStream fis
                = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Creating object of class 'Geeks'
        Geeks g1 = (Geeks)ois.readObject();

        // Print and display the
        // deserialized object value
        System.out.println("Deserialized Object Value:"
                + g1.i + "..." + g1.j);
    }
}
