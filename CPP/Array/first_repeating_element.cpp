#include<bits/stdc++.h>
using namespace std;

int find(int a[],int n){
    const int N=1e6+1;
    int idx[N];
    int minidx=INT_MAX;
    for(int i=0;i<N;i++){
        idx[i]=-1;
    }
    for(int i=0;i<n;i++){
        if(idx[a[i]]==-1){
            idx[a[i]]=i;
        }
        else{
            minidx=idx[a[i]];
        }
    }
    return idx[0];
}


int find_index(int a[],int n){
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]==a[j])
            {
                return i+1;
            }
        }
    }
    return 0;
}

int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<find_index(a,n);
    return 0;
}