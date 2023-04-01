package org.example.basic;

import java.sql.SQLOutput;

public class FibonacciExample {

    public static void main(String[] args) {
      for(int i=0;i<10;i++)
      {
          System.out.println(fibonacci(i));}
    }
    public static int fibonacci(int n)
    {


            if(n==0)
                return n;
           else if(n==1)
                return n;
          else  {
              int j=fibonacci(n-1)+fibonacci(n-2);
                return j;
            }



    }
}

