#include <iostream>
using namespace std;
#include <bits/stdc++.h>
int main() 
{
  long a,b;
  cin>>a>>b;
  long m=min(a,b);
  long i=m;
  while(i>1)
  {
    if(a%i==0&&b%i==0)
      break;
    i--;
  }
  cout<<i;
  return 0;
}