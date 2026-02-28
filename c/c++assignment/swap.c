#include<stdio.h>
int main()
{
    int x=10;
    int y=20;
    int z=30;
    int *px=&x;
    int *py=&y;
    int *pz=&z;
    int s=*px;
    *px=*pz;
    *pz=s;
    printf("value of x=%d \n",x);
     printf("value of y=%d \n",y);
     printf("value of z=%d \n",z);
      printf("address of x=%d \n",&x);
       printf("address of y=%d \n",&y);
        printf("address of z=%d \n",&z);

}