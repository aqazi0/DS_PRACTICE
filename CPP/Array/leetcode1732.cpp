#include<bits/stdc++.h>

using namespace std;

int largestAltitude(vector<int>& nums) {
    int n=nums.size();
    int larg=0;
    for(int i=1;i<n;i++){
        nums[i]+=nums[i-1];
        if(nums[i]>larg){
            larg=nums[i];
        }
    }
    return larg;
}


int main(){
    int n;
    cin>>n;
    vector<int> nums(n+1);
    nums[0]=0;
    for(int i=1;i<n+1;i++){
        cin>>nums[i];
    }
    int ans=largestAltitude(nums);
    cout<<ans;
    return 0;
}