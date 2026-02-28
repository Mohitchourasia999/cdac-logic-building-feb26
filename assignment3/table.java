package assignment3;
import java.util.Scanner;
public class table {
    static void multiplication(int n)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        multiplication(n);
        sc.close();;
    }
}
