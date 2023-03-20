package org.example.basicprograms;

public class IsPrime {

    public static void main(String args[]) {
            for(int i=0;i<100;i++) {
                if (isPrime(i)) {
                    System.out.print(i +" ");
                }
            }

    }

    public static boolean isPrime(int i) {
        boolean isPrime=true;
        if (i < 2) {
            isPrime=false;
        } else {
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }

        }
        return isPrime;
    }
}
