#include<bits/stdc++.h>
using namespace std;

int countGoodTriplets(vector<int>& arr, int a, int b, int c) {
        int answer=0;
        for(int i=0;i<arr.size()-2;i++){
            for(int j=i+1;j<arr.size()-1;j++){
                if(abs(arr[i]-arr[j])<=a){
                    for(int k=j+1;k<arr.size();k++){
                        if(abs(arr[j]-arr[k])<=b && abs(arr[i]-arr[k])<=c && j!=k)
                        {
                            cout<<i<<j<<k<<endl;
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }


int main(){
    vector<int> nums1={3,0,1,1,9,7};
    int a=7,b=2,c=3;
    cout<<countGoodTriplets(nums1,a,b,c);
    return 0;
}