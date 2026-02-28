package assignment4;

import java.util.Scanner;

public class largestno {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+"element of array :");
            a[i]=sc.nextInt();
        }
        int max=a[0];
         for(int i=0;i<5;i++)
        {
           for(int j=0;j<5;j++)
           {
            if(max<a[j])
            {
                max=a[j];
           }
        }
    }
        System.out.println("Largest number in array is :"+max);
        
sc.close();
    }
}

    

    



