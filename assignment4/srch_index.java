package assignment4;

import java.util.Scanner;

public class srch_index {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+" element:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int s=sc.nextInt();
        int c=0;
        for(int i=0;i<5;i++)
        {
            if(a[i]==s)
            {
                System.out.println("The element "+s+" is found at index "+i);
                break;
            }
            else{
                     c+=1;
            }
            }
            if(c>=1)
            {
                System.out.println(s+" not found in array");
            }
              sc.close();
        }
    }
      

