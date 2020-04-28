#include<iostream>
using namespace std;
int main()
{
  int t;
  cin >>t;
  int x = t%100;
  if(x==0)
  {
    if(t%400==0)
    {
      cout << t <<" is a leap year"<<endl;
    }
    else
    {
      cout << t <<" is not a leap year"<<endl;
    }
  }
  else
  {
    if(x%4==0)
  	{
      cout << t <<" is a leap year"<<endl;
  	}
    else
    {
      cout << t <<" is not a leap year"<<endl; 
    }
  }
}