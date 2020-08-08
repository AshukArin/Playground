#include <iostream>
#include <string>
using namespace std;

int main() 
{
   string s;
  getline(cin,s);
  int t=1,c=0;
  while(t<s.size())
  {
    if((s[t]==' '||s[t]=='.')&&t!=s.size()-1)
      c++;
    t++;
  }
  if(c<=10)
    cout << "Caption eligible for the contest";
  else
    cout << "Caption not eligible for the contest";
    return 0;
}