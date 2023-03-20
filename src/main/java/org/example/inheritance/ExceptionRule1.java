package org.example.inheritance;

class A
{
    void display1() throws Exception
    {
        System.out.println("Inside display1() method of Parent class");
    }

}
class B extends A
{
    @Override
        //no issue while throwing unchecked exception
    void display1()
    {
        System.out.println("Inside display1() method of Child class");
    }

}
//Driver class
class MethodOverridingDemo7
{
    public static void main(String args[])
    {

}
}