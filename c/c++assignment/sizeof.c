#include<stdio.h>
int main()
{
    short int a;
     int b;
      long int c; long d;
       long int e;
      unsigned int f;
       float g;
     double h;
      long double i;
       char j;

        printf("short int=  %hd\n",sizeof(a));
        printf("int =%d\n",sizeof(b));
        printf("long int=  %ld\n",sizeof(c));
        printf("long=  %ld\n",sizeof(d));
        printf("long int=  %ld\n",sizeof(e));
        printf("unsigned int=  %u\n",sizeof(f));
        printf("float=  %f\n",sizeof(g));
        printf("double= %d\n",sizeof(h));
        printf("long double=  %lf\n",sizeof(i));
        printf("char=  %c\n",sizeof(j));

       if(sizeof(f)==sizeof(b))
       {
        printf("unsinged int size is equal to int size \n");
       }
       else{
        printf("unsigned int size is not equal to int size \n");
       }
      
}