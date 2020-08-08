#include<iostream>
using namespace std;

int main()
{
    int r,c;
  cin>>r>>c;
  int a[r][c],b[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
  }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>b[i][j];
        }
  }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cout<<a[i][j]+b[i][j]<<" ";
        }
    cout<<"\n";
  }
}