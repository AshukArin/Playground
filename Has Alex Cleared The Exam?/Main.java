#include <iostream>
using namespace std;

int main() 
{
  int n,r,c=0;
  cin>>n;
  int arr[n];
  
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>r;
  for(int i=0;i<n;i++)
    if(arr[i]==r)
    {
      c=1;
      break;
    }
  if(c==1)
    cout<<"She passed her exam";
  else
    cout<< "She failed";
  
  
    return 0;
}