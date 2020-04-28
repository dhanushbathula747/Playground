#include<bits/stdc++.h>
using namespace std;
int main()
{
  int t;
  cin >> t;
  int x = t%100;
  if(x==0)
  {
    if(t%400==0)
    {
      cout << "Vicky can celebrate his birthday.";
    }
    else
    {
      cout <<"Vicky can't celebrate.";
    }
  }
  else
  {
    if(x%4==0)
  	{
    	cout << "Vicky can celebrate his birthday.";
  	}
  	else
  	{
    	cout << "Vicky can't celebrate.";
  	}
  }
 }
