package assignment4;

public class s_literals { 

    public static void main(String[] args) {

        // creating two string variables using string literals
        String s1 = "Hello";
        String s2 = "Hello";

        // check if both refer to same object
        if(s1 == s2) {
            System.out.println("Both variables point to the SAME object");
        } else {
            System.out.println("Both variables point to DIFFERENT objects");
        }
    }
}

