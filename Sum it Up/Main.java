#include <iostream>
using namespace std;
long sum(long n)
{ long s=0;
  while(n>0)
  {
    s=s+n%10;
    n=n/10;
  }
 return s;
}
int main() 
{
   long n;
  cin>>n;
  while(n>=10)
  {
    n=sum(n);
  }
    cout<<n;
    return 0;
}