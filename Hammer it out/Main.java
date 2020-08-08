#include<iostream>
using namespace std;
int main()
{
  long n;cin>>n;
  long s1=0,s2=0,i=0,m=n;
  while(m>0)
  {
    if(i==0)
    {  s1+=m%10;i=1;}
    else
    { s2+=m%10;i=0;
    }
    m=m/10;
  }
   
  cout<<s1-s2;
  return 0;
}