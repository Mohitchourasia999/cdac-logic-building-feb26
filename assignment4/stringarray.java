package assignment4;

import java.util.Scanner;

public class stringarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[4];
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter "+(i+1)+"name:");
            s[i]=sc.nextLine();
        }
        System.out.println("Entered string array is:");
         for(int i=0;i<4;i++)
        {
             System.out.println(s[i]);
          
        }
        
        
sc.close();
    
}
    
}
