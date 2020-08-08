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
int main()
{
	ios::sync_with_stdio(false); 
	cin.tie(NULL);	
	const auto PI = std::acos(-1);
	ll t,n,j,i=1,p,q,a,b,c,d1,d2,d3,temp,count=0;
	cin>>t;	
	while(1)
    {
      if(count>=t)
        break;
      else
      {	
        count+=12*i;
      }
      i++;
    }      
	cout<<8*(i-1);
	return 0;
}