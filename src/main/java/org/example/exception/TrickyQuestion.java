package org.example.exception;

class Exception1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            int i=9/0;
            System.out.println(i);
            return;
        } catch (Exception e) {
            System.out.println("exception caught");
            return;
        }
    //    System.out.println("task completed"); //Ground rule -> if there is a return statement in try then no code after try- catch will be valid.

    }

}