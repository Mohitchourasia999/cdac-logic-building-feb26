package assignment4;

public class pattern2 {

     public static void main(String[] args) {
        
        int c=0; 
        for(int i=1;i<=5;i++)
        {     int a=1;
            for(int j=0;j<(i+c);j++)
            {
            
                if(j%2==0)
                {
                    System.out.print((a));
                    a++;
                }
                else{
                    System.out.print("*");
                }
            }
              c++;
               System.out.println();
    }
    
     }
    }

