#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  	int sum=0;int dig=0;int n1=n;
    while(n1!=0)
    { dig++;n1=n1/10;}
  n1=n;
  	while(n!=0){
      int rem=n%10;
      sum=sum+power(rem,dig);
      n=n/10;
    }
     if(sum==n1)
       return 1;
  	 else
       return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}