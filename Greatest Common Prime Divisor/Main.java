#include<iostream>
using namespace std;
#include<bits/stdc++.h>
int isprime(long n)
{
	long j=2;int count;
	while(j<=sqrt(n))
	{
		if(n%j==0&&j!=n)
			return -1;
		
		j++;
	}
	return 1;
}
int main()
{
  long n;
  long m;
  cin>>m>>n;
  long t=min(m,n);
  while(t>=2)
  {
  	if(m%t==0&&n%t==0&&isprime(t)==1)
  	{
  		cout<<t;break;
  	}
  	t--;
  }
  if(t==1)
  	cout<<-1;
  return 0;
}