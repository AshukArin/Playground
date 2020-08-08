#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int gcd(int a,int b){
  int small=min(a,b);
  while(small>=1){
    if(a%small==0&&b%small==0){
      break;
    }
    else
      small--;
  }
  return small;
}
int main()
{
    int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
    gcd1=gcd(a,b);
    res=gcd(gcd1,c);
  	if(res==ans)
      cout<<"Answer is correct.";
    else
      cout<<"Answer is wrong.";
    return 0;
}