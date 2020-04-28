#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin >> a >>b;
  
  if(a==2)
  {
    float b1=b*0.5;
    b1=b+b1;
    cout << b1 <<endl;
  }
  else if(a==3)
  {
    b=b*2;
    cout << b <<endl;
  }
  else
  {
    cout <<"Number of items is more"<<endl;
  }
}