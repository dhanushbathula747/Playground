#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin >> a >> b >> c;
  b = b*75;
  c=c*30;
  if(b+c==a)
  {
    cout <<"Boat is stable"<<endl;
  }
  else if(b+c<a)
  {
    cout <<"Boat is stable"<<endl;
  }
  else
  {
    cout <<"Boat will drow"<<endl;
  }
}