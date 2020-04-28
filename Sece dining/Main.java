#include<iostream>
using namespace std;
int main()
{
  string str;
  int a;
  
  cin >>str;
  cin >>a;
  
    if(a==1 && str=="front")
    {
      cout <<"Left Handed";
    }
  else if(a==1 && str=="rear")
    {
      cout <<"Right Handed";
    }
  
    else if(a<2 && str=="rear")
    {
      cout <<"Left Handed";
    }
    else
    {
      cout <<"Right Handed";
    }
}