package org.example.arrays;

class ArrayEx1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i=10;
        for(i=10;i>0;i--)
        {
            for(int j=1;j<=10;j++)
            {
                if((i+j)==11)
                {
                    int k=i*j;
                    System.out.println(i + "*" + j+"="+k );
                }
            }
        }
    }
}
