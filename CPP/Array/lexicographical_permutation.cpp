#include<bits/stdc++.h>

using namespace std;

void print(vector<int> nums){
    for(int i=0;i<nums.size();i++){
        cout<<nums[i];
    }
    cout<<endl;
}


int getPermutation(int n) {
    vector<int> nums;
    int l=INT_MAX, larg=INT_MAX, p=1, t=n;
    for(int i=1;i<=n;i++){
        nums.push_back(i);
    }
    print(nums);
    for(int i=t;i>0;i--)
        p=p*i;
    t=n-1;
    n=n-1;
    for(int i=0;i<p-1;i++)
    {
        while(n>0){
            if(nums[n]>nums[n-1]){
                break;
            }
            n--;
        }
        int g=n-1;
        while(n!=nums.size()){
            if(nums[n]>nums[g] && nums[n]<larg){
                l=n;
                larg=nums[n];
            }
            n++;
        }
        swap(nums[l], nums[g]);
        sort(nums.begin()+g+1, nums.end());
        print(nums);
        n=t;
        l=INT_MAX; 
        larg=INT_MAX;
    }
    return 0;
}


int main(){
    int n,k;
    cin>>n;
    getPermutation(n);
    return 0;
}