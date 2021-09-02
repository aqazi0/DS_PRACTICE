#include<bits/stdc++.h>
using namespace std;

int missingNumber(vector<int>& nums) {
        int i=0;
        for(;i<nums.size();i++){
            if(nums[i]<nums.size())
                swap(nums[i],nums[nums[i]]);
        }
        for(i=0;i<nums.size();i++)
            if(nums[i]!=i)
                return i;
        return i;
    }

int main(){
    vector<int> nums1={1,10,27,35,24,40,37,21,9,45,33,40,42,44,48,4,30,50,44,36,26,26,26,26,7,31,41,26,4,13,5,14,29,11,8,22,39,4,7,1,37,10,35,7,24,40,2,5,14,40,25,10,41,17,23,39,24,31,8,8,32,30,31,31,20,6,10,7,48,22,48,17,31,45,11,34,2,14,34,24,10,45,35,2,49,34,20,42,6,45,17,34,24,11,23,50,15,35,35,50};
    cout<<minPairSum(nums1);
    return 0;
}