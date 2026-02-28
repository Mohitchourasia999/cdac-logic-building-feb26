package assignment2;

public class values {
     byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;

    public static void main(String[] args) {
        
        values t=new values();// we use this statement in code to allocate memory to the uninitialized variables
        System.out.println((byte)t.a);
        System.out.println((short)t.b); 
        System.out.println((int)t.c); 
        System.out.println((long)t.d);
         System.out.println((float)t.e);
          System.out.println((double)t.f);
           System.out.println((char)t.g);
            System.out.println((boolean)t.h);
    

    }
    
}
