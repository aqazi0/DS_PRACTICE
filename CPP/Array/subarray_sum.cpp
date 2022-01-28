// Sum of all sub array

#include<bits/stdc++.h>
using namespace std;


int sum_subarray(int a[],int n){
    int s=0;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            s=s+a[j];
            cout<<s<<"  ";
        }
        cout<<endl;
        s=0;
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
    sum_subarray(a,n);
    return 0;
}