package assignment4;

public class pattern1 {

    public static void main(String[] args) {
        
        int c=0;
        for(int i=1;i<=5;i++)
        {    
            for(int j=0;j<(i+c);j++)
            {
            
                if(j%2==0)
                {
                    System.out.print(i);
                }
                else{
                    System.out.print("*");
                }
            }
              c++;
               System.out.println();
    }
     c=5;
     for(int i=5;i>=2;i--)
        {    
            for(int j=0;j<(i+c)-1;j++)
            {
            
                if(j%2==0)
                {
                    System.out.print(i);
                }
                else{
                    System.out.print("*");
                }
            }
              c--;
               System.out.println();
    }
    

}
}

    

