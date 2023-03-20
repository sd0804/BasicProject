package org.example.exception;
//If there is a return statement in try/catch/finally then it will stop the further execution of the program.
class Exception21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String returnVal = method1();
        System.out.println(returnVal);
    }

    public static String method1() {
        try {
            int i = 9/0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("exception caught");
            return "from catch";
        } finally {
            System.out.println("finally block executing");
        }
        System.out.println("end");
        return "from end";
    }

}