package org.example.basic;

public class ArmstrongNumber {

    public static void main(String[] args) {
        IsArmstrong(123);
       int i=456;
       int c=i/10;


    }

    private static boolean IsArmstrong(int i) {
        int temp=i;
        int digits=0;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        System.out.println("digits" +digits);
        double sum=0;
        int cal=0;
        int cal1=0;
        for(int j=0;j<=2;j++)
        {
            cal=i%10;
        sum=sum+(Math.pow(cal,digits));
            i=i/10;
        }

        System.out.println(sum);

        return true;
    }
}
