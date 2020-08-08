#include <iostream>
using namespace std;
long pow(long a,long b)
{
  long k=1;
  while(b--)
    k=k*a;
  return k;
}
int main() 
{
   long n;
  cin>>n;
  long m=n,c=0,c1=0;
  while(m>0)
  {
    c++;
    m=m/10;
  }m=n;
  while(m>0)
  {
    c1+=pow(m%10,c);
    m=m/10;
  }
  if(c1==n)
    cout<<"Yes";
  else
    cout<<"No";
    return 0;
}