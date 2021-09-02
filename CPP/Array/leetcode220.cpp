#include<bits/stdc++.h>
using namespace std;

bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        for(int i=0;i<=nums.size()-k;i++){
            for(int j=i+1;j<=i+k && j<nums.size();j++){
                if(abs(nums[i]-nums[j])<=t){
                    cout<<j<<endl;
                    return true;
                }
            }
        }
        return false;
    }

int main(){
    vector<int> nums1={-2147483648,2147483647};
    int k=1,t=1;
    cout<<containsNearbyAlmostDuplicate(nums1,k,t);
    return 0;
}