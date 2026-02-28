package assignment4;

import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int odd=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
              odd+=i;
        }
        System.out.println("Sum of odd numbers between 1 and "+n+"is : "+odd);
sc.close();
    }
    
}
