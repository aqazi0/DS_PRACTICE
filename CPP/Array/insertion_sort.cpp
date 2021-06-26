#include<iostream>
using namespace std;

void print(int a[],int n){
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    return;
}


int insertion_sort(int a[],int n){
    for(int i=1;i<n;i++){
        int cur=a[i];
        int j=i-1;
        while(a[j]>cur && j>=0){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=cur;
    }
    print(a, n);
    return 0;
}


int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    insertion_sort(a,n);
    return 0;
}