// Two Pointer Algorithm

#include<bits/stdc++.h>
using namespace std;

void print(int a[],int n){
    for(int i=0;i<n;i++){
        cout<<a[i];
    }
    return;
}

int reverse(int a[],int n){
    int l=0,h=n-1;
    while(l<h){
        swap(a[l++],a[h--]);
    }
    print(a,n);
    return 0;
}


int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    reverse(a,n);
}