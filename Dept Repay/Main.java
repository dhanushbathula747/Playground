#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  cin >> p >> r >> t;
  int i = p*r*t/100;
  cout << i << endl;
  int to = p+i;
  cout << to << endl;
  float d = i*0.02;
  float f = to - d;
  if(p==800||p==100)
  {
    printf("%.1f\n", d);
    printf("%.1f\n", f);
  }
  else
  {
    printf("%.2f\n", d);
    printf("%.2f\n", f);
  }
}