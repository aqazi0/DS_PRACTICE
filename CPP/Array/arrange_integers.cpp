//Arranging negative one side of array

#include<bits/stdc++.h>

using namespace std;

void print(int a[],int n){
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    return;
}


int arrange(int a[],int n){
    int lb=0,ub=n-1;
    while(lb<=ub){
        if(a[lb]<0){
            lb++;
        }
        else{
            swap(a[lb],a[ub]);
            ub--;
        }
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
    arrange(a,n);
    return 0;
}