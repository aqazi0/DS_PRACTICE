// largest sum of subarray (Kadane Algorithm)
#include<bits/stdc++.h>
using namespace std;

int maxProduct(vector<int>& nums){
    int i=0,n=nums.size();
    int p=1,max=INT_MIN,l=0,h=n-1;
    for(i=0;i<n;i++){
        s=s*nums[i];
        if(p<max)
            max=p;
        if(s<=0){
            k=p;
            p=1;
        }
    }
    return max;
}


int main(){
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<maxProduct(a);
    return 0;
}