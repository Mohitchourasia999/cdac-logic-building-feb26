package assignment4;

import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word :");
        String s=sc.nextLine();
        String s1="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
           char c=s.charAt(i);
           s1=c+s1;
    }
    System.out.println(s1);
    if(s1.equals(s))
    {
        System.out.println("the String ' "+s+" ' is palindrone");
    }
    else{
        System.out.println("the String ' "+s+" ' is not palindrone");
    }
    sc.close();
}
}
