#include<bits/stdc++.h>
using namespace std;

void print(vector<int> answer){
    for(int i=0;i<answer.size();i++){
        cout<<answer[i];
    }
}


vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
    int count=0;
    vector<int> ans;
    for(int i=0;i<nums.size();i++){
        for(int j=0;j<nums.size() || j!=i ;j++){
            if(nums[i]>nums[j]){
                count++;}
        }
        cout<<endl;
        ans.push_back(count);
        count=0;
    }
    return ans;
}


int main(){
    vector<int> points={8,1,2,2,3};
    print(smallerNumbersThanCurrent(points));
    return 0;
}