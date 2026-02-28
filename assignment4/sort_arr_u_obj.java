package assignment4;
import java.util.Scanner;

class SortArray {

    // sorting method
    void sort(int a[]) {

        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}

 class sort_w_o_mthd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for(int i = 0; i < a.length; i++) {
            System.out.println("Enter " + (i+1) + " element:");
            a[i] = sc.nextInt();
        }

        // object creation
        SortArray obj = new SortArray();

        // method calling using object
        obj.sort(a);

        System.out.println("Sorted array:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}