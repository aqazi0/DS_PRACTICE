#include<bits/stdc++.h>
using namespace std;

void print(vector<int> answer){
    cout<<"[";
    int i;
    for(i=0;i<answer.size()-1;i++){
        cout<<answer[i]<<",";
    }
    cout<<answer[i]<<"]";
}

vector<int> plusOne(vector<int>& digits) {
        int n=digits.size()-1;
        if(digits[n]>=0 && digits[n]<9){
            digits[n]++;
        }
        else{
            int i=n;
            while(digits[i]==9 && i>=0){
                digits[i]=0;
                i--;
            }
            if(digits[0]==0)
                digits.insert(digits.begin(),1);
            else
                digits[i]++;
        }
        return digits;
    }

int main(){
    vector<int> nums1={9,9};
    print(plusOne(nums1));
    return 0;
}