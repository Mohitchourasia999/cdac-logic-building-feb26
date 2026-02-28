package assignment4;
import java.util.Scanner;
public class sort_w_o_mthd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter"+(i+1)+"element:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                
                if(a[j]>a[j+1])
                {
                       int temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;

                }
            }
        }
        System.out.println("soreted array:");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
