#include<iostream>
using namespace std;
void findminmax(int a , int b, int c , int &minval , int &maxval)
{
     if(a>b&&a>c)
     {
        maxval=a;
     }
     if(b>a&&b>c)
     {
        maxval=b;
     }
      if(c>a&&c>b)
     {
        maxval=c;
     }
     if(a<b&&a<c)
     minval=a;
     if(c<b&&a>c)
     minval=c;
     if(b<a&&b<c)
     minval=b;

}
int main()
{
int a,b,c, lo , hi ;
cout<< "enter value of a=";
cin>>a;
cout<< "enter value of b=";
cin>>b;
cout<< "enter value of c=";
cin>>c;
findminmax(a,b,c,lo,hi);
cout<<"min & max values among"<<a<<b<<c<<endl;
cout<<"minimum val="<<lo<<endl;
cout<<"maximum val="<<hi<<endl;
}