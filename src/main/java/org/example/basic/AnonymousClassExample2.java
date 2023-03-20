package org.example.basic;

class Polygon1 {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo1 {
    public void createClass() {

        // creation of anonymous class extending class Polygon
        Polygon1 p1 = new Polygon1() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

class Main43 {
    public static void main(String[] args) {
        AnonymousDemo1 an = new AnonymousDemo1();
        an.createClass();
    }
}

