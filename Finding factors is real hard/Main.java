#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() 
{
   long long n;
   cin>>n;
  int k=(floor(sqrt(n)));
   long long arr[k];
   long long i=1,c=0;
  while(i<=sqrt(n))
  {
    if(n%i==0)
    { cout<<i<<" ";arr[c]=n/i;c++;}
    i++;
  }
  while(c--)
    if(arr[c]!=sqrt(n))
    	cout<<arr[c]<<" ";
   return 0;
}