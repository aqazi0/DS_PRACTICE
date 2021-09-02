#include<bits/stdc++.h>
using namespace std;
int main(){
    int a[]={1,2,3,4};
    int n=sizeof(a)/sizeof(int);
    int key=7;
    auto ans=find(a,a+n,key);
    int index=ans-a;
    if(index==n)
        cout<<key<<" not found";
    else
        cout<<key<<" present at index "<<index;
}