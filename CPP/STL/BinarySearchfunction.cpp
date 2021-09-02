#include<bits/stdc++.h>
using namespace std;
int main(){
    int a[]={10,20,30,40,40,50,50,50,50,60,80};
    int n=sizeof(a)/sizeof(int);
    int key=40;
    bool search=binary_search(a,a+n,key);
    if(search)
    cout<<"Present"<<endl;
    else
    cout<<"Not Present"<<endl;


    auto x=lower_bound(a,a+n,key);
    cout<<x-a<<endl;


    auto y=upper_bound(a,a+n,key);
    cout<<y-a<<endl;
    return 0;
}