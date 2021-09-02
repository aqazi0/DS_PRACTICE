#include<bits/stdc++.h>

using namespace std;

int main(){
    vector<int> nums;
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        nums.push_back(temp);
    }
    int l=0,m=0;
    while(m<n){
        if(nums[m]>=0){
            m++;
        }
        else{
            swap(nums[m],nums[l]);
            l++;
            m++;
        }
    }
    for(int i=0;i<n;i++){
        cout<<nums[i]<<',';
    }
    return 0;
}