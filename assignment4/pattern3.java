package assignment4;

public class pattern3 {

    public static void main(String[] args) {
        
        int c=0; 
        for(int i=1;i<=5;i++)
        {     
            for(int j=0;j<(i+c);j++)
            {
            
                if(j%2==0)
                {
                    System.out.print((j+1));
                
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
