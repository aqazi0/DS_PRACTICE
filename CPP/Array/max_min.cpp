// To find maximum and minimum element in array

#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int a[n];
    int minimum=INT_MAX;
    int maximum=INT_MIN;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n;i++){
        minimum=min(minimum,a[i]);
        maximum=max(maximum,a[i]);
    }
    cout<<maximum<<"   "<<minimum;
}