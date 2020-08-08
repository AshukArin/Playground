#include <iostream>
using namespace std;
#include<bits/stdc++.h>
long pow(int a,int b)
{ long s=1;
  while(b--)
    s=s*a;
 return s;
}
int main()
{
   int n;
   int a;
  cin>>n>>a;
   cout<<pow(n,a);
   return 0;
}