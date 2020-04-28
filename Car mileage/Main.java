#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  cin >> m >> l >> d;
  
  if(m*l>=d)
  {
    cout <<"Can reach" <<endl;
  }
  else
  {
    cout <<"Cannot reach"<<endl;
  }
}