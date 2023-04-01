package org.example.basic;

public class Palindrome {

    public static void main(String[] args) {
        boolean isPalindrome=palindrome("lol");
        System.out.println(isPalindrome);

    }

    private static boolean palindrome(String m) {

        String temp=m;
        StringBuilder process=new StringBuilder(m);
        StringBuilder s2=process.reverse();
        if(temp.toString().equalsIgnoreCase(s2.toString()))
        {
            return true;
        }
        return false;

    }
}
