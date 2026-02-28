package assignment3;
import java.util.Scanner;
public class positive {
    static int number(Scanner sc){
        int n;
        do
        {
            System.out.println("Enter positive number");
            n=sc.nextInt();
            if(n<0){
           
                System.out.println("please enter positive number");
            }
           
        }
        while(n<0);
        return n;
         
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=number(sc);
        System.out.println("number is : "+n);
    }
    
}
