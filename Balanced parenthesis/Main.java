#include<iostream>
using namespace std;
#include<bits/stdc++.h>
void push(char a[],int &top,char ch)
{
  top++;
  a[top]=ch;
}
char pop(char a[],int &top)
{
  if(top!=-1)
  {
    return a[top--];
  }
  else
    return '\0';
}
int main()
{
  int top=-1,t=-1,c=0;
  
  string s;
  cin>>s;
  int n=s.length();
  char b[n],a[n];
  if(n%2==0)
  {
    for(int i=0;i<n;i++)
    	push(a,top,s[i]);
    push(b,t,pop(a,top));
    while(top!=-1&&t!=-1)
    {	
      	if(a[top]==')'||a[top]=='}'||a[top]==']')
        {
          push(b,t,pop(a,top));
        }
        else if(a[top]=='('||a[top]=='{'||a[top]=='[')
        {
          if(a[top]=='('&&b[t]==')'||a[top]=='{'&&b[t]=='}'||a[top]=='['&&b[t]==']')
          {
            pop(a,top);
            pop(b,t);
          }
          else
          {
            c=1;break;
          }
        }
    }
    if(top==-1&&t==-1)
      c=0;
    
  }
  else
    c=1;
  if(c)
    cout<<"Not Balanced";
  else
    cout<<"Balanced";
      
  return 0;
}