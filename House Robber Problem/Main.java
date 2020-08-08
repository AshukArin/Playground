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
  ll t,n,j,i,p,q,a,b,c,d1,d2,d3,temp,count=0;
  multimap<ll,ll,greater<ll>> ct;
  vi ar;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>temp;
    ar.PB(temp);
    ct.insert(pair <int, int> (temp,i));
    
  }
  for(auto itr=ct.cbegin();itr!=ct.cend();itr++)
  {
    if(ar[itr->second]!=-1)
    {
      count+=itr->first;
      if(itr->second==0)
        ar[(itr->second)+1]=-1;
      else if(itr->second==n-1)
        ar[(itr->second)-1]=-1;
      else
      {
        ar[(itr->second)+1]=-1;
        ar[(itr->second)-1]=-1;
      }
    }
  }
  cout<<count;
  return 0;
}