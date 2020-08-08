#include <iostream>



int main() 
{
  using namespace std;
  #include <string>
   string s;
  	getline(cin,s);
  	for(auto i=s.crbegin();i<s.crend();i++)
      cout<<*i;
    
    return 0;
}