#include<bits/stdc++.h>
using namespace std;

int searchInsert(vector<int>& nums, int target) {
        int lb=0,ub=nums.size()-1,p;
        while(lb<ub){
            p=lb+ub/2;
            if(nums[p]>target)
                ub=p-1;
            else
                lb=p+1;
        }
            return lb;
    }

int main(){
    vector<int> nums1={1,3,5,7};
    cout<<searchInsert(nums1,8);
    return 0;
}