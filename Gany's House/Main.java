#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef vector<int> vi;
typedef pair<int,int> pi;
typedef vector<pair<int,int>> vpi;
typedef vector<ll> vl;
typedef vector<double> vd;
#define F first
#define S second
#define PB push_back
#define MP make_pair
#define REP(i,a,b) for(int i = a; i < b; i++)
#define REPD(i,a,b) for(int i = a; i > b; i--)
long dig(long n)
{
	long c=0;
	while(n>0)
	{
		n=n/10;
		c++;
	}
	return c;
}
int main()
{
	ios::sync_with_stdio(false); 
	cin.tie(NULL);	
	const auto PI = std::acos(-1);
	long t,n,j,i,p,q,a,b,c,d1,d2,d3,temp,count=1;
	long m;
 	cin>>temp;
 	m=0;
 	n=1;
 	if(temp!=1)
 	while(1)
 	{
 		count++;
 		c=m+n;
 		m=n;
 		n=c;
 		if(dig(c)==temp)
 			break;
 	}
    
  	cout<<count;
	return 0;
}