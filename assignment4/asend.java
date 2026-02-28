package assignment4;
import java.util.Scanner;
import java.util.Arrays;
public class asend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
                System.out.println("Enter"+(i+1)+"element:");
                a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted array is:");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sc.close();
    }
    
}
