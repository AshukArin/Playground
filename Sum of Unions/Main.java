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
	int t,n,j,i,p,q,a,b,c,d1,d2,d3,temp,count=0;
	int m;
 	cin>>m>>n;
  	int arr[m][n];
  	REP(i,0,m)
  		REP(j,0,n)
  		{
  			cin>>arr[i][j];
  		}
  	cin>>a>>b;
  	
  	REP(i,0,n)
  	count=count+arr[a][i];
	REP(i,0,m)
  	count=count+arr[i][b];
  	count-=arr[a][b];
  	cout<<count;
	return 0;
}