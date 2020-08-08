#include <bits/stdc++.h>
using namespace std;
typedef struct node
{
  int n;
  struct node* next;
  struct node* prev;

}node;
node* a(int n)
{
  int i=1;
  node *root;
  root=(node*)malloc(sizeof(node));
  root->n=i;
  node *temp;
  node *prev=root;
  while(n>1)
  {
    
    temp=(node*)malloc(sizeof(node));
    temp->n=++i;
    n--;
    prev->next=temp;
    temp->prev=prev;
    prev=temp;
  }
  temp->next=root;
  root->prev=temp;
  return root;
}
int ans(node* root,int k,int n)
{
  node* temp=root;
  
  while(n>1)
  {
    int t=k;
    while(t--)
    {
      temp=temp->next;
      
    }
    
    node* t1=temp->prev;
    t1->prev->next=temp;
    temp->prev=t1->prev;
    n--;

  }
  return temp->n;
}
int main()
{
  int n,k;
  cin>>n>>k;
  node* root=a(n);
  cout<<ans(root,k,n);
  return 0;
}