#include<bits/stdc++.h>

using namespace std;

void print(vector<int> &a){
    for(int i=0;i<a.size();i++){
        cout<<a[i]<<endl;
    }
}
int partition(vector<int> &a, int l, int h){
    int i=l-1, pivot = a[h];
    for(int j=l;j<h;j++){
        if(a[j]<=pivot){
            swap(a[++i],a[j]);
        }
    }
    swap(a[h],a[++i]);
    return i;
}

void quick_sort(vector<int> &a, int l, int h){
    if(l<h){
        int p=partition(a, l, h);
        quick_sort(a, l, p-1);
        quick_sort(a, p+1, h);
    }
}


int main(){
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int l=0, h=n-1;

    quick_sort(a, l, h);    
    print(a);
    return 0;
}