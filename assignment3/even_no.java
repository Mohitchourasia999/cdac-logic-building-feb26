package assignment3;

public class even_no {
    void even()
    {
        int i=1;
        while(i<=50)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        even_no obj =new even_no();
        obj.even();
    }
}
