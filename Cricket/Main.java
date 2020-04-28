#include<bits/stdc++.h>
using namespace std;
int main()
{
    float a,b,c,d;
    cin >> a >> b >> c >> d;
    
    cout << a/6 <<endl;
    int x = d;
    float r = x%6;
    r=r/10;
    x=x/6;
    d=x+r;
    cout << d <<endl;
    printf("%.1f\n",c/d);
    int y=a/6;
    printf("%.1f\n",b/y);
    
    if(c/d >= b/y)
    {
        cout <<"Eligible to Win" <<endl;
    }
    else
    {
        cout <<"Not Eligible to Win" <<endl;
    }
}