package assignment3;
import java.util.Scanner;
public class sum {
    static void sumofno(int a , int b){
        System.out.println("sum of"+a+"and"+b+"is"+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        sumofno(a,b);
        sc.close();

    }
    
}