package assignment4;

public class pattern8 {

     public static void main(String[] args) {
        
        for(int i=0;i<6;i++)
        {     

                if(i==0||i==5)
                {
                    for(int k=0;k<6;k++)
                    {
                        System.out.print("*");
                    }
                     System.out.println();
                }
                else{
                    for(int l=0;l<6;l++)
                    {
                        if(l==0||l==5)
                        {
                            System.out.print("*");
                        }
                        else{
                                 System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            
               
                    
                
            }
               
    }
    
    
}
    
