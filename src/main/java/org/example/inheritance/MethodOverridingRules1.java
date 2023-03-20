package org.example.inheritance;

//Parent Class
class Parent11
{
    static void method1()
    {
        System.out.println("Inside static method1() of Parent class");
    }
    void method2()
    {
        System.out.println("Inside non-static(instance) method2() of Parent class");
    }
}
class Child2 extends Parent11
{
    //This will hide method1() of Child
    static void method1()
    {
        System.out.println("Inside static method1() of child class");
    }
    //This method overrides method2() in Parent
    @Override
    public void method2()
    {
        System.out.println("Inside non-static(instance) method2() of child class");
    }
}
//Driver class
class MethodOverridingDemo1
{
    public static void main(String args[])
    {
        Parent11 obj2 = new Child2();
        obj2.method1();
        obj2.method2();
    }
}
