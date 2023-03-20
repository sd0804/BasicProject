package org.example.interfaces;

// create an interface
interface Language1 {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language1 {

    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

class Main4 {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}
