#include<iostream>
using namespace std;
float circlearea(float r)
{
   return(22*r*r/7);
}
float circleperimeter(float r)
{
    return(2*22*r/7);
}
int main()
{
    const float pi=3.14159f;
    float f1=circlearea(pi);
    float f2=circleperimeter(pi);
    // pi=3.0f; // error ->  assignment of read-only variable 'pi'.
    cout <<"area of circle ="<< f1 << endl;
    cout <<"circumference of circle ="<< f2 <<endl;
}