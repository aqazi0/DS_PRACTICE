// largest sum of subarray (Kadane Algorithm)
#include<bits/stdc++.h>
using namespace std;

int kadane(int a[],int n){
    int l=INT_MIN,k=0,s=0;
    for(int i=0;i<n;i++){
        k=a[i];
        s=s+k;
        if(s>l){
        l=s;}
        if(s<0){
            s=0;
        }
    }
    return l;
}

int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<kadane(a,n);
    return 0;
}