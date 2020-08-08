#include <iostream>
using namespace std;

int main() 
{
  long n,c1=0,c2=1,c;
  	cin>>n;
  	while(n>1)
    {
      c=c1+c2;
      c1=c2;
      c2=c;
      n--;
    }
  cout<<c1;
   	return 0;
}