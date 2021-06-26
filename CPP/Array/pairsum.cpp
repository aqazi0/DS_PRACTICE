#include<bits/stdc++.h>
using namespace std;

int pairsum(int a[],int n,int k)
{
    sort(a,a+n);
    int low=0,high=n-1;
    while(low<high){
        if(a[low]+a[high]==k){
            cout<<low<<"  "<<high;
            return true;
        }
        low++;
        high--;
    }
    return false;
}
int main(){
    int n,k;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cin>>k;
    cout<<pairsum(a,n,k);
    return 0;
}