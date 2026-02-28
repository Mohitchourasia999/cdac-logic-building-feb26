package assignment4;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word :");
        String s=sc.nextLine();
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count++;
            }
        }
        System.out.println("Number of vowels in string "+s+" is :"+count);
        sc.close();
    }
    
}
