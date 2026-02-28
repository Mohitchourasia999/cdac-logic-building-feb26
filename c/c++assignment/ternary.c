#include<stdio.h>
int main()
{
    float m,e,h,c,s;
    printf("enter marks obtained in subjects: \n");
    printf("enter marks obtained in maths: \n");
    scanf("%f",&m);
    printf("enter marks obtained in english: \n");
    scanf("%f",&e);
    printf("enter marks obtained in hindi: \n");
    scanf("%f",&h);
    printf("enter marks obtained in social: \n");
    scanf("%f",&s);
    printf("enter marks obtained in computer: \n");
    scanf("%f",&c);

    float t=(m+e+h+s+c)*100/500;
    printf("total percentage=%f\n",t);

    char result=(t>=75)? printf("grade=A"):
                 (t>=60)? printf("grade=B"):
                 (t>=45)? printf("grade=C"): printf("Fail");
                 printf("%c \n",result);
                 return 0;
                }