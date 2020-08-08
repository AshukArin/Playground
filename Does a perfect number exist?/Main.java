#include<iostream>
using namespace std;
#include<bits/stdc++.h>
int main()
{
  long n;
  cin>>n;
  long i=1,c=0;
  while(i<sqrt(n))
  {
    if(n%i==0)
      c=c+i+n/i;
    i++;    
  }
  if(n/sqrt(n)==0)
    c+=sqrt(n);
  c-=n;
if(c==n)
  cout<<"Yes";
  else
    cout<<"No";
  return 0;
}