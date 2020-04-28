#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  cin >> a >> b >> c>> d>> e>> f>> g>> h>> i;
  int a1=a*b/100;
  a=a-a1;
  a=a+c;
  
  int d1=d*e/100;
  d=d-d1;
  d=d+f;
  
  int g1=g*h/100;
  g=g-g1;
  g=g+i;
  
  if(a<=d && a<=g)
  {
    cout<<"In Flipkart Rs."<<a<<endl;
    cout<<"In Snapdeal Rs."<<d<<endl;
    cout<<"In Amazon Rs."<<g<<endl;
    cout <<"He will prefer Flipkart"<<endl;
  }
  else if(d<g)
  {
    cout<<"In Flipkart Rs."<<a<<endl;
    cout<<"In Snapdeal Rs."<<d<<endl;
    cout<<"In Amazon Rs."<<g<<endl;
    cout <<"He will prefer Snapdeal"<<endl;
  }
  else
  {
    cout<<"In Flipkart Rs."<<a<<endl;
    cout<<"In Snapdeal Rs."<<d<<endl;
    cout<<"In Amazon Rs."<<g<<endl;
    cout <<"He will prefer Amazon"<<endl;
  }
}