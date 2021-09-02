// Merge Without Extra Space 
/*
Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}
*/

#include<bits/stdc++.h>
using namespace std;

void print(int a[], int n, int b[], int m){
    for(int i=0;i<n;i++){
        cout<<a[i]<<endl;
    }
    for(int i=0;i<m;i++){
        cout<<b[i]<<endl;
    }
}
void sort1(int a[], int h){
    int p=a[0];
    for (int i = 1; i < h; i++)
    {
        if(a[i]<p){
            swap(a[i-1],a[i]);
        }
        else
            break;
    }
}

void merge(int a[], int n, int b[], int m){
    int i=0,j=0;
    while(i<n){
        if(a[i]>b[j]){
            swap(a[i],b[j]);
            sort1(b,m);
        }
        i++;
    }
    print(a,n,b,m);
}


int main(){
    int n,i=0;
    cin>>n;
    int a[n];
    for(;i<n;i++)
        cin>>a[i];
    int m;
    cin>>m;
    int b[m];
    for(i=0;i<m;i++)
        cin>>b[i];
    merge(a,n,b,m);
}