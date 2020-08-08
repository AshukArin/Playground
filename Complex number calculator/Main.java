#include <iostream>
using namespace std;

int main() 
{
   int a,b,c,d;
  	int x;char ch='+';
  cin>>x>>a>>b>>c>>d;
  
  
  switch(x)
  {
    case 1:
    {
      if(b+d>=0)
    	ch='+';
      cout<<a+c<<ch<<b+d<<"i";
      break;
    }
    case 2:
    {
      if(b-d>=0)
         ch='+';
      cout<<a-c<<ch<<b-d<<"i";
      break;
    }
    case 3:
    {
      if(a*d+b*c>=0)
        ch='+';
      cout<<a*c-b*d<<a*d+b*c<<"i";
      break;
    }
    default:
      cout<<"Invalid choice";
  }
    return 0;
}