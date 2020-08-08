#include <iostream>
using namespace std;
struct bnode{
  int n;
  struct bnode* l;
  struct bnode* r;
};
void inorder(bnode* root,int &s)
{
  if(root==NULL)
    return ;
  
  if(root->l==NULL&&root->r==NULL)
    s+=root->n;
  inorder(root->l,s);
  inorder(root->r,s);
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
  int k=1;int s=0;
  while(k>=0)
  {
    cin>>k;
    if(k!=-1)
    	insert_bst(&root,k);
  }
  inorder(root,s);
  cout<<"Sum of all leaf nodes are "<<s;
  return 0;
}