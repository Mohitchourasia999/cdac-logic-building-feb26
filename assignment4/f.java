package assignment4;
import java.util.Scanner;
public class f {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        System.out.println("Fibonacci series :");
        System.out.print(0);
        for(int i=0;i<=n;i++)
        {
               System.out.print(","+ (i+c));
               c++;
        }
        System.out.println();
        sc.close();
    }
    
}
