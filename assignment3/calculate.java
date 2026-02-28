package assignment3;
import java.util.Scanner;
public class calculate {

    static void sum(int n)
    {
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("sum of numbers from "+" 1"+" to "+n+" is : "+s);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number :");
        int n=sc.nextInt();
        sum(n);
        sc.close();
    }
}
