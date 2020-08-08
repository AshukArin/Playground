#include <iostream>
using namespace std;
int bs(int arr[],int l,int h,int k)
{
  if(l<=h)
  {
    int mid=(l+h)/2;
    if(arr[mid]==k)
      return mid;
    else if(arr[mid]>k)
      return bs(arr,l,mid-1,k);
    else
      return bs(arr,mid+1,h,k);
  }
  return -1;
}
  
int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int k;
  cin>>k;
  int c=bs(arr,0,n-1,k);
  if(c>=0)
    cout<<c;
  else
    cout<<"Not found";
  return 0;
}