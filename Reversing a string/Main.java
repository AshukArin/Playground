#include <iostream>
#include <cstring>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;    
cin.getline(str,100);
while(str[i])
	i++;
count=i;
end=i-1;
  for(i=0;i<count;i++,end--)
    rev[i]=str[end];
std::cout<<rev;
}