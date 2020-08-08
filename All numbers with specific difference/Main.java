#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int sum(int n)
{
  int s=0;
  while(n>0)
  {
    s+=n%10;
    n=n/10;
  }
  return s;
}

int main()
{
  int t,n,d;

  
    cin>>n>>d;int count=0;
    for(int i=1;i<=n;i++)
    {
      if(abs(i-sum(i))>=d)
      {
        
        count++;
      }
    }
    cout<<count;

  return 0;
}