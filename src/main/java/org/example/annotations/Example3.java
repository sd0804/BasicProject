package org.example.annotations;

class Main88 {
    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    @SuppressWarnings("deprecated")
    public static void main(String args[]) {
        Main depObj = new Main();
        depObj. deprecatedMethod();
    }
}
