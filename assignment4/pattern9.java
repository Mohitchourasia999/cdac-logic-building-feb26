package assignment4;
public class pattern9 {
    public static void main(String[] args) {

        
        int n = 5;

        // Upper Pyramid
        for(int i = 1; i <= n; i++) {

            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Pyramid
        for(int i = n - 1; i >= 1; i--) {

            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}