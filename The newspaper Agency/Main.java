#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  cin >> w >> x >> y;
  int s = w*x;
  int c = w*y;
  int p = s-c-100;
  cout << p <<endl;
}