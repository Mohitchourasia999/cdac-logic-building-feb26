#include<iostream>
using namespace std;
void doubleit(int &n)
{
    n=n*2;
    printf("Inside doubleIt: %d\n",n);
}
int main()
{
    int num=7;
    doubleit(num);
    printf("In main after call: %d\n",num);
    return 0;

}