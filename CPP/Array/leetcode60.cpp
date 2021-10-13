// #include<bits/stdc++.h>

// using namespace std;

// void print(vector<int> nums){
//     for(int i=0;i<nums.size();i++){
//         cout<<nums[i];
//     }
//     cout<<endl;
// }


// int getPermutation(vector<int> nums) {
//     int n=nums.size();
//     int l=INT_MAX, larg=INT_MAX, p=1, t=n;
//     print(nums);
//     t=n-1;
//     n=n-1;
//     while(true)
//     {
//         while(n>0){
//             if(nums[n]>nums[n-1]){
//                 break;
//             }
//             n--;
//         }
//         int g=n-1;
//         while(n!=nums.size()){
//             if(nums[n]>nums[g] && nums[n]<larg){
//                 l=n;
//                 larg=nums[n];
//             }
//             n++;
//         }
//         if(l>n){
//             break;
//         }
//         swap(nums[l], nums[g]);
//         sort(nums.begin()+g+1, nums.end());
//         print(nums);
//         n=t;
//         l=INT_MAX; 
//         larg=INT_MAX;
//     }
//     return 0;
// }


// int main(){
//     int n;
//     cin>>n;
//     vector<int> nums(n);
//     for(int i=0;i<nums.size();i++)
//     {
//         cin>>nums[i];
//     }
//     getPermutation(nums);
//     return 0;
// }


# include<bits/stdc++.h>

using namespace std;


void print(vector<vector<int>> nums){
    for(int i=0;i<nums.size();i++){
        for(int j=0;j<nums[i].size();j++){
            cout<<nums[i][j];
        }
        cout<<endl;
    }
}

vector<vector<int>> permute(vector<int>& nums) {
    vector<vector<int>> ans;
    ans.push_back(nums);
    int n=nums.size();
    int l=INT_MAX, larg=INT_MAX, p=1, t=n;
    t=n-1;
    n=n-1;
    while(true)
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
        if(l>n)
            break;
        swap(nums[l], nums[g]);
        sort(nums.begin()+g+1, nums.end());
        ans.push_back(nums);
        n=t;
        l=INT_MAX; 
        larg=INT_MAX;
    }
    print(ans);
    return ans;
}

int main(){
    int n;
    cin>>n;
    vector<int> nums(n);
    for(int i=0;i<nums.size();i++)
    {
        cin>>nums[i];
    }
    permute(nums);
    return 0;
}