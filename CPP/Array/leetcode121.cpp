#include<bits/stdc++.h>
using namespace std;

int maxProfit(vector<int>& prices) {
    int maxprofit=0,profit=0;
    int k=prices[0];
    for(int i=1;i<prices.size();i++){
        if(k>=prices[i]){
            k=prices[i];
            continue;
        }
        else{
            profit=prices[i]-k;
        }
        if(profit>maxprofit)
            maxprofit=profit;
    }
    return maxprofit;
}

int main(){
    vector<int> nums1={-2147483648,2147483647};
    cout<<maxProfit(nums1);
    return 0;
}