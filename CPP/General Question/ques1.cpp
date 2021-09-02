// 1 rupee = 1 chocolate
// 1 chocolate= 1 wrapper
// 3 wrapper of chocolate =1 chocolate
// Find Maximum chocolate


#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,nc=0;
    cin>>n;
    int t=n,wr=n;
    while(wr>2){
        nc=wr/3;
        wr=nc+(wr%3);
        t=t+nc;
    }
    cout<<t;
}