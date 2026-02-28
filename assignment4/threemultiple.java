package assignment4;
import java.util.Scanner;
public class threemultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
              System.out.print(i+" ");
        }
        System.out.println();
sc.close();
    }
    
}
