package assignment4;

import java.util.Scanner;

public class printarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+"element of array :");
            a[i]=sc.nextInt();
        }
        System.out.println("Enterd array is :");
         for(int i=0;i<5;i++)
        {
           System.out.print(a[i]+"  ");
        }
        
sc.close();
    }
    
}
