#include <iostream>
using namespace std;
#include<string>
int main() 
{
   int n=0,i=0;char ar[100000];
 	while(cin>>ar[i])
    {
      if(ar[i]=='1')
        n++;
      i++;
    }
  int j=i;
  while(i--)
  {
    if(i>n-1)
      ar[i]='0';
    else
      ar[i]='1';
  }
  for(i=0;i<j;i++)
    cout<<ar[i];
  return 0;
}