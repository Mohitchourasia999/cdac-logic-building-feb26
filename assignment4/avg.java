package assignment4;

import java.util.Scanner;

public class avg {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        double s=0.0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+"element of array :");
            a[i]=sc.nextInt();
        }
         for(int i=0;i<5;i++)
        {
            s+=a[i];
          
        }
        double s1=s/5;
        System.out.println("average of elements in array is : " +s1);
sc.close();
    
}
    
}
