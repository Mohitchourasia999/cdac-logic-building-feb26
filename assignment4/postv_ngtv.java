package assignment4;

import java.util.Scanner;

public class postv_ngtv {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        int p=0 , n=0;
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter "+(i+1)+"element of array :");
            a[i]=sc.nextInt();
        }
         for(int i=0;i<6;i++)
        {
            if(a[i]>=0)
            {
                   p+=1;
            }
            else{
                n+=1;
            }
          
        }
         System.out.println("count of Positive number in array :"+p);
         System.out.println("count of negative numbers in array :"+n);
        
sc.close();
    
}
    
}
