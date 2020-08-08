#include<iostream>
#include<bits/stdc++.h>
using namespace std;
long SumNumbersDivisible(long m, long n)
{
  long i,count=0;
 	if(m%15==0)
      i=m;
  	else
      i=(floor(m/15)+1)*15;
  long k=(n-i)/15+1;
  count=(k*(2*i+(k-1)*15))/2;
  if(n%15==0)
    count-=n;
  return count;
}
  
  
int main()
{
  long m,n,c;
  cin>>m>>n;
  c=SumNumbersDivisible(m,n);cout<<c;
  return 0;
  
}