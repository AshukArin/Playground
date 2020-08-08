#include<iostream>
using namespace std;
#define sz 1000
int stack[sz];
void push1(int n,int &s1,int s)
{
  if(s1==0)
    cout<<"error!! stack full\n";
  else
  {
    s1--;
    stack[s1]=n;
  }
}
int pop1(int &s1,int s)
{
  if(s1==s)
  {
    cout<<"Stack underflow. pop from stack 1 failed \n";
    return -1;
  }
  else
  {
    
    return stack[s1++];
  }
}
void display1(int s1,int s)
{
  cout<<"Stack 1 Elements: \n";
  
  while(s1!=s)
  {
      cout<<stack[s1]<<" ";
      s1++;
  }
  cout<<"\n";
}
void push2(int n,int &s2,int s)
{
  if(s2==999)
    cout<<"error!! stack full\n";
  else
  {
    s2++;
    stack[s2]=n;
  }
}
int pop2(int &s2,int s)
{
  if(s2==s)
  {
    cout<<"Stack underflow. pop from stack 2 failed \n";
    return -1;
  }
  else
  {
    return stack[s2--];
  }
}
void display2(int s2,int s)
{
  cout<<"Stack 2 Elements: \n";
  while(s2!=s)
  {
      cout<<stack[s2]<<" ";
      s2--;
  }
  cout<<"\n";
}
    
  
int main()
{
  int s1,s2,n;
  cin>>s1;
  
  int s=s1;
  for(int i=0;i<s;i++)
  {
    cin>>n;
    push1(n,s1,s);
  }
  cin>>s2;
  int t=s2;
  s2=s;
  for(int i=0;i<t;i++)
  {
    cin>>n;
    push2(n,s2,s);
  }
  int a,b;
  cin>>a>>b;
  
  display1(s1,s);
  display2(s2,s);
  while(a--)
    pop1(s1,s);
  while(b--)
    pop2(s2,s);
  display1(s1,s);
  display2(s2,s);
  
  return 0;
}