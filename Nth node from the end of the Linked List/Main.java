#include <iostream>
using namespace std;


int main() 
{
 	int arr[1000];
  	int i=0;
  	cin>>arr[i];
  	while(arr[i]>=0)
    {
      i++;
      cin>>arr[i];
    }
  	int n;
  	cin>>n;
  if(n>i)
    cout<<"Enter the nth node:\nThere is no nth node in the list";
  else
    cout<<"Enter the nth node:\n"<<arr[i-n]<<" is the nth node element in the list";
    return 0;
}