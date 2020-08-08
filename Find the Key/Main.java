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
int dig(int n)
{
	return n%10;
}
int main()
{
	ios::sync_with_stdio(false); 
	cin.tie(NULL);
	
	const auto PI = std::acos(-1);
	ll t,n,j,i,p,q,a,b,c,d1,d2,d3,temp,count=0;
	cin>>a>>b>>c;
	temp=max(max(dig(a),dig(b)),dig(c))+10*min(min(dig(a/10),dig(b/10)),dig(c/10))+
		 100*max(max(dig(a/100),dig(b/100)),dig(c/100))+1000*min(min(dig(a/1000),dig(b/1000)),dig(c/1000));
	
	cout<<temp;
	return 0;
}