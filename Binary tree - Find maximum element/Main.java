#include <iostream>
using namespace std;
struct bnode{
  int n;
  struct bnode* l;
  struct bnode* r;
};
void inorder(bnode* root,int ar[],int &i)
{
  
    if(root==NULL)
      return ;
    inorder(root->l,ar,i);
      ar[i]=root->n;
      i++;
    
    inorder(root->r,ar,i);
  
}
void insert_bst(bnode** root,int val)
{
  bnode* t=new bnode;
  t->n=val;
  t->r=NULL;
  t->l=NULL;
  if(*root==NULL)
    *root=t;
  else
  {
    bnode* temp=*root;
    if(val>temp->n)
    {
      if(temp->r==NULL)
        temp->r=t;
      else
      {
        insert_bst(&temp->r,val);
      }
    }
    else
    {
      if(temp->l==NULL)
        temp->l=t;
      else
      {
        insert_bst(&temp->l,val);
      }
    }
  }
}
      
int main() 
{
  bnode* root=NULL;
  int k=1;int s=0;int ar[100000];
  while(k>=0)
  {
    cin>>k;
    if(k!=-1)
    	insert_bst(&root,k);
  }

  cout<<"Maximum element is ";inorder(root,ar,s);cout<<ar[s-1];
  
  return 0;
}