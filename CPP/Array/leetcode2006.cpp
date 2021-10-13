#include<bits/stdc++.h>

using namespace std;

int countKDifference(vector<int> nums, int k){
    int n=nums.size(), c=0;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(abs(nums[i]-nums[j])==k){
                c++;
            }
        }
    }
    return c;
}

int main(){
    int n;
    cin>>n;
    vector<int> nums(n);
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
    int k;
    cin>>k;
    int ans= countKDifference(nums, k);
    cout<<ans;
    return 0;
}