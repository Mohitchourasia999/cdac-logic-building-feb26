package assignment4;

public class string_literals {

    public static void main(String[] args) {

        String str1 ="java";
        String str3="java";
         String str2 = "java";

        System.out.println("Is all pointing to the same object ? " + ((str3==str2)&&(str3==str1)&&(str2==str1)));
    }
    
    
}
