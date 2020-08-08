#include<bits/stdc++.h>
using namespace std;
void swap(int &a,int &b){
	int temp;
    temp=a;
    a=b;
    b=temp;
}
int main()
{
	int x,y;
    cin>>x>>y;
    cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
    swap(x,y);
    cout<<"After swapping a= "<<x<<" and b="<<y<<"\n";
    return 0;
}