package assignment4;

import java.util.Scanner;

public class sumofarray {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int s=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+"element of array :");
            a[i]=sc.nextInt();
        }
         for(int i=0;i<5;i++)
        {
            s+=a[i];
          
        }
         System.out.println("sum of array is : " +s);
        
sc.close();
    
}
}
