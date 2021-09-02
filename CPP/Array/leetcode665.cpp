#include<bits/stdc++.h>
using namespace std;

bool checkPossibility(vector<int>& nums) {
        int c=0,k=0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
                if(nums[i+1]<k && nums[i]>nums[i+2])
                    return false;
                nums[i]=k;
            }
            
            k=nums[i];
            if(c==2)
                return false;
        }
        return true;
    }

int main(){
    vector<int> nums1={3,5,7,4,6,9};
    cout<<checkPossibility(nums1);
    return 0;
}