package org.example.basic;

public class PrimeNumber {
    public static void main(String[] args) {

        for(int i=2;i<20;i++) {
            if (isPrime(i))
                System.out.println(i);
        }


    }

    private static boolean isPrime(int i) {
        boolean isPrime=true;
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0) {
                isPrime=false;

                 return isPrime;
            }
        }
        return isPrime;
    }
}
