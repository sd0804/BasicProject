package org.example.java8.methodreference;

// Java Program to Illustrate How One can use
// Static method reference
// To Sort with Custom Comparator
// But using object method reference

// Importing required classes
import java.util.*;

// Class 1
// Helper class
// Object need to be sorted
class Person1 {

    // Attributes of a person
    private String name;
    private Integer age;

    // Constructor
    public Person1(String name, int age)
    {
        // This keyword refers to current object itself
        this.name = name;
        this.age = age;
    }

    // Getter-setter methods
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

// Class 2
// Helper class
// Comparator class
class ComparisonProvider {

    // Method 1
    // To compare with name
    public int compareByName(Person1 a, Person1 b)
    {
        return a.getName().compareTo(b.getName());
    }

    // Method 2
    // To compare with age
    public int compareByAge(Person1 a, Person1 b)
    {
        return a.getAge().compareTo(b.getAge());
    }
}

// Class 3
// Main class
class GFG16 {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Person1> personList = new ArrayList<>();

        // Adding elements to above object
        // using add() method
        personList.add(new Person1("vicky", 24));
        personList.add(new Person1("poonam", 25));
        personList.add(new Person1("sachin", 19));

        // A comparator class with multiple
        // comparator methods
        ComparisonProvider comparator
                = new ComparisonProvider();

        // Now using instance method reference
        // to sort array by name
        Collections.sort(personList,
                comparator::compareByName);

        // Display message only
        System.out.println("Sort by name :");

        // Using streams
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        // Using instance method reference
        // to sort array by age
        Collections.sort(personList,
                comparator::compareByAge);

        // Display message only
        System.out.println("Sort by age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}
