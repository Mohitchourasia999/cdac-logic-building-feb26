#include<stdio.h>
int main()
{
    int a=10;
    int *p=&a;
    int **q=&p;
    printf("value of *p=%d\n",*p);
    printf("value of p=%d\n",p);
    printf("value of &a=%d\n",&a);
    printf("value of **q=%d \n",**q);
    printf("value of q=%d\n",q);
}