// largest sum of subarray (Kadane Algorithm)
#include<bits/stdc++.h>
using namespace std;

int removeDuplicates(vector<int>& nums) {
        int n=nums.size(),k=0,curr=nums[0],p=0;
        for(int i=0;i<n;i++){
            cout<<curr;
            if(nums[i]==curr)
                p++;
            else
                p=1;
            curr=nums[i];
            swap(nums[i],nums[k]);
            if(p<=2)
                k++;
        }
        return k;
    }


int main(){
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int k= removeDuplicates(a);
    for(int i=0;i<k;i++){
        cout<<a[i]<<endl;;
    }
    return 0;
}