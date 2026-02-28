package assignment3;
import java.util.Scanner;
public class age_checker {
    static void agecategory(int age){
        if(age<18){
            System.out.println("you comes under minority");
        }
        else if(age>=18&&age<60){
            System.out.println("you are an adult");
        }
        else{
            System.out.println("your age comes under senior citizen");
        }
    }
         public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your age");
            int age=sc.nextInt();
            agecategory(age);
            sc.close();
         }
        
    }

