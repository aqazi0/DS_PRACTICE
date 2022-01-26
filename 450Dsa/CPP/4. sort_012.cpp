// Dutch national flag Algorithm

#include<bits/stdc++.h>
using namespace std;

void print(int a[],int n){
    for(int i=0;i<n;i++){
        cout<<a[i];
    }
}


int dutch_sort(int a[],int n){
    int l=0,m=0,h=n-1,i=0,t;
    while(m<=h){
        if(a[m]==0){
            t=a[m];
            a[m]=a[l];
            a[l]=t;
            l++;
            m++;
        }
        else if(a[m]==1){
            m++;
        }
        else{
            t=a[m];
            a[m]=a[h];
            a[h]=t;
            h--;
        }
    }
    print(a,n);
    return 0;
}


int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    dutch_sort(a,n);
    return 0;
}