#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x1 = 3;
  int y1 = 4;
  int x2,y2;
  cin >> x2 >> y2;
  int x = abs(x2-x1);
  int y = abs(y2-y1);
  x=x*x;
  y=y*y;
  int d = sqrt(x+y);
  cout << d <<endl;
}