#include<bits/stdc++.h>
using namespace std;

int max_till(int a[],int x, int n){
    int maximum=INT_MIN;
    for(int i=0;i<=x;i++){
        maximum=max(maximum,a[i]);
    }
    return maximum;
}



int main(){
    int n,x;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cin>>x;
    cout<<max_till(a,x,n);
    return 0;
}