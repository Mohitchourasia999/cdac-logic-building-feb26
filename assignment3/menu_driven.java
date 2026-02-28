package assignment3;
import java.util.Scanner;
public class menu_driven {
     byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1 for grade evaluation system");
        System.out.println("Enter 2 for leap year check");
        System.out.println("Enter 3 for day of the week");
        System.out.println("Enter 4 for identity default values of variables");
        System.out.println("Enter 5 to exit the code");
        System.out.println("Enter any number:");

        int n=sc.nextInt();

        switch(n){

            case 1: 
            System.out.println("enter the marks you have scored in maths:");
            int math=sc.nextInt() ;
            System.out.println("enter the marks you have scored in science:");
             int science=sc.nextInt() ;
            System.out.println("enter the marks you have scored in history:");
             int history=sc.nextInt();
        int avg=(math+science+history)/3;
       if(avg>=90){
            System.out.println("aversge marks="+avg);
            System.out.println("Grade A");
        }
        else if(avg>=70 && avg<=89){
             System.out.println("aversge marks="+avg);
            System.out.println("Grade B");
        }
        else if(avg>=50 && avg<=69){
             System.out.println("aversge marks="+avg);
            System.out.println("Grade C");
        }
        else if(avg>=30 && avg<=49){
             System.out.println("aversge marks="+avg);
            System.out.println("Grade D");
        }
        else{
             System.out.println("aversge marks="+avg);
            System.out.println("Fails");
        }
        break;

        case 2: 
        System.out.println("Enter the year which you want to check leap year or not:");
         long year = sc.nextLong();

         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          } else {
           System.out.println(year + " is not a leap year");
             }
        break;

        case 3:

            System.out.println("Enter the number :");
             int d_no=sc.nextInt();
        switch (d_no) {
            case 1: System.out.println("Day is Monday");
                break;
            case 2: System.out.println("Day is Tuesday");
                break;
            case 3: System.out.println("Day is Wednesday");
                break;
            case 4: System.out.println("Day is Thursday");
                break;
            case 5: System.out.println("Day is Friday");
                break;
            case 6: System.out.println("Day is Saturday");
                break;
            case 7: System.out.println("Day is Sunday");
                break;

            default: System.out.println("invalid day number");
                break;
        }
        break;

        case 4:
            menu_driven t=new menu_driven();// we use this statement in code to allocate memory to the uninitialized variables
        System.out.println((byte)t.a);
        System.out.println((short)t.b); 
        System.out.println((int)t.c); 
        System.out.println((long)t.d);
         System.out.println((float)t.e);
          System.out.println((double)t.f);
           System.out.println((char)t.g);
            System.out.println((boolean)t.h);
            break;

            case 5:
                System.out.println("Exit");
                break;

                default :
                System.out.println("you have entered a wrong choice");

        }
        sc.close();

    }
    
}
