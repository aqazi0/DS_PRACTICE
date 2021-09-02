#include<bits/stdc++.h>
using namespace std;

double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int m=nums1.size();
        int n=nums2.size(); 
        double ans;
        vector<int> nums(m+n);
        merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),nums.begin());
        sort(nums.begin(),nums.end());
        if((m+n)%2==0)
            ans=(nums[(m+n)/2]+nums[((m+n)/2)-1])/2.0;
        else
            ans=nums[((m+n)/2)];    
        return ans;
    }

int main(){
    vector<int> nums1={1,3};
    vector<int> nums2={2,4};
    cout<<findMedianSortedArrays(nums1,nums2);
    return 0;
}