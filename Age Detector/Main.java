#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a, b;
    
    cin >>a >>b;
    if(a>b)
    {
        a=a+1900;
        b=b+2000;
        cout << b-a <<endl;
        
    }
    else
    {
        a=a+2000;
        b=b+2000;
        cout << b-a <<endl;
    }
}