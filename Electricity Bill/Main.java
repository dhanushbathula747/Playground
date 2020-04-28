#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a;
  cin >>a;
  if(a<=200)
  {
    cout <<"Rs."<<floor(a*0.5) <<endl;
  }
  else if(a<=400)
  {
    cout <<"Rs."<<floor((a*0.65)+100)<<endl;
  }
  else if(a<=600)
  {
    cout <<"Rs."<<floor((a*0.80)+200) <<endl;
  }
  else
  {
    cout <<"Rs."<<floor((a*1.25)+425)<<endl;
  }
}