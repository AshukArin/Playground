#include<iostream>
using namespace std;
int arr[1000];
int in[1000];

int main()
{
  int t,i=0;
  cin>>t;
  arr[i]=t;
  in[t]=1;
  cout<<"Linked list before removal of duplicates\n";
  if(t>=0)
    cout<<t<<"\n";
  while(t>=0)
  {
    
    cin>>t;
    if(t>=0)
    	cout<<t<<"\n";
    if(in[t]==1)
      continue;
    else
    {
      i++;
      in[t]=1;
      arr[i]=t;
    }
  }
  int j=0;
  cout<<"Linked list after removal of duplicates\n";
    
  while(j<=i-1)
  {
    cout<<arr[j]<<"\n";
    j++;
  }
  
  return 0;
}