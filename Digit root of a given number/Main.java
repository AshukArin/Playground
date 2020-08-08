#include <iostream>
using namespace std;
#include<bits/stdc++.h>
int s(int n)
{
  int count=0;
  while(n!=0)
  {
    count+=n%10;
    n=n/10;
  }
  return count;
}
int main() 
{
   int n;
  cin>>n;
 
  while(n>=10)
  {
    n=s(n);
  }
  cout<< n;
    return 0;
}