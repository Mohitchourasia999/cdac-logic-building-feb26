package assignment4;
import java.util.Scanner;
public class reverse_s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word :");
        String s=sc.nextLine();
        String s1=" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            s1=c+s1;
        }
        System.out.println("reverse of entered word is :"+s1);
        sc.close();
    }
    
}
