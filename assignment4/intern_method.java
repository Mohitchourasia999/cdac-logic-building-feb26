package assignment4;

public class intern_method {

      public static void main(String[] args) {

        String str1 =new String("hello");
       
        String str3=str1.intern();

         String str2 = "hello";

        System.out.println("Is str2 and str1 pointing to the same object ? " + (str3==str2));
    }
    
}
