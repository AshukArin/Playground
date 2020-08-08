#include <iostream>
using namespace std;
struct bnode{
  int n;
  struct bnode* l;
  struct bnode* r;
};
int height(bnode* root)
{
  
    if(root==NULL)
      return 0;
 	return 1+max(height(root->l),height(root->r));
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
  int k=1;
  while(k>=0)
  {
    cin>>k;
    if(k!=-1)
    	insert_bst(&root,k);
  }

  cout<<"Height of the tree is "<<height(root);
  
  return 0;
}