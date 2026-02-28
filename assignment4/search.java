package assignment4;
import java.util.Scanner;
public class search {

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
        int count=0;
        for(int i=0;i<5;i++)
        {
            if(a[i]==s)
            {
                count+=1;
            }
        }
        if(count>=1)
        {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        sc.close();

    }
    
}
