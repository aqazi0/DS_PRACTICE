// To find longest arithmatic subarray

#include<bits/stdc++.h>
using namespace std;

int largest(int a[],int n)
{
    int k=1,l=1;
    int d=a[1]-a[0];
    for(int i=2;i<n;i++){
        if(a[i]-a[i-1]==d){
            k++;
        }
        else{
            if(l<k)
                l=k;
            k=1;
            d=a[i]-a[i-1];
        }
    }
    return l+1;
}
int main(){
    int n;
    cin>>n;
    int a[n];
    for (int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<largest(a,n);
}