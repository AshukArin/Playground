#include<iostream>
using namespace std;
#include<bits/stdc++.h>
int main()
{
  long n,i=2,c=0;
  cin>>n;
  while(i<=sqrt(n))
  {
    if(n%i==0)
    {
      c=1;break;}
    i++;
  }
  if(c==0)
    cout<<"Prime";
  else
    cout<<"Not Prime";
  return 0;
}