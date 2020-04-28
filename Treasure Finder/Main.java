#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin >>a >>b>>c;
  if(a>b&&a>c)
  {
    int x = max(b,c);
    cout <<"The treasure is in box which has number "<< x <<endl;
    if(a%b==0 && c%b==0)
    {
      cout <<"The code to open the box is "<<a <<endl;
    }
    else if(a%b==0 && c%b==0)
    {
      cout <<"The code to open the box is "<<b <<endl;
    }
    else if(a%c==0 && b%c==0)
    {
      cout <<"The code to open the box is "<<b <<endl;
    }
    else
    {
      cout <<"The code to open the box is 1"<<endl;
    }
  }
  else if(b>a&&b<c)
  {
    cout <<"The treasure is in box which has number "<< b <<endl;
    if(b%a==0 && c%a==0)
    {
      cout <<"The code to open the box is "<<a <<endl;
    }
    else if(a%b==0 && c%b==0)
    {
      cout <<"The code to open the box is "<<b <<endl;
    }
    else if(a%c==0 && b%c==0)
    {
      cout <<"The code to open the box is "<<b <<endl;
    }
    else
    {
      cout <<"The code to open the box is 1"<<endl;
    }
  }
  else
  {
    cout <<"The treasure is in box which has number " <<c <<endl;
    if(b%a==0 && c%a==0)
    {
      cout <<"The code to open the box is "<<a <<endl;
    }
    else if(a%b==0 && c%b==0)
    {
      cout <<"The code to open the box is "<<b <<endl;
    }
    else if(a%c==0 && b%c==0)
    {
      cout <<"The code to open the box is "<<b <<endl;
    }
    else
    {
      cout <<"The code to open the box is 1"<<endl;
    }
  }

}