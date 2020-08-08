#include<bits/stdc++.h>
using namespace std;
void ans(int m,int n,int req){
  while(n>1){
    m=m*2;
    n--;
  }

if(m>=req)
  cout<<"Doctor, you can proceed with your experiment.";
else
  cout<<"Sorry Doctor! You need more bacteria.";
}
int main(){
  int m,n,req;
  cin>>m>>n>>req;
  ans(m,n,req);
  return 0;
}