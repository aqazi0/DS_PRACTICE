// To find no. of record breaking numbers in array
// A number is record breaking if it is highest among all the no. appearing before and the following number.

#include<bits/stdc++.h>
using namespace std;

record_breaking(int a[],int n){
    int l=0,c=0;
    for(int i=0;i<n;i++){
        if(a[i]>l){
            l=a[i];
            if(a[i]>a[i+1]||i==(n-1))
                c++;
        }
    }
    return c;
}


int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<record_breaking(a,n);
    return 0;
}