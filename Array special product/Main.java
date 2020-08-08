#include<iostream>
using namespace std;
int* fn(int arr[],int n,int k)
{
  int* s=(int*)malloc(sizeof(int)*n);
  for(int i=0;i<n;i++)
  {
    s[i]=k/arr[i];
  }
  return s;
}
int main()
{
  int n;
  cin>>n;
  int arr[n],p=1;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    p=p*arr[i];
  }
  int* s=(int*)malloc(sizeof(int)*n);
  s=fn(arr,n,p);
  for(int i=0;i<n;i++)
  {
    cout<<s[i]<<"\n";
  }
  return 0;
}