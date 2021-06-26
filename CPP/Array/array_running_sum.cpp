//Leetcode 1480


#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,s=0;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<"[";
    for(int i=0;i<n-1;i++){
        s=s+a[i];
        cout<<s<<",";
    }
    s=s+a[n-1];
    cout<<s<<"]";
}