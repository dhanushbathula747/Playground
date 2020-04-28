#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,t;
  cout <<"Enter first number : Enter second number : Menu"<<endl;
  cout << "1.Addition" <<endl;
  cout << "2.Subtraction" <<endl;
  cout << "3.Multiplication" <<endl;
  cout << "4.Division" <<endl;
  cout << "5.Remainder" <<endl;
  cin >> a >> b >>t;
  switch(t)
  {
    case 1: cout << a + b <<endl;
      break;
    case 2: cout << a - b <<endl;
      break;
    case 3: cout << a * b <<endl;
      break;
    case 4: cout << a / b <<endl;
      break;
    case 5: cout << a % b <<endl;
      break;
    default: cout <<"Invalid operation"<<endl;
      break;
  }
}