#include<bits/stdc++.h>
using namespace std;



int maxSatisfaction(vector<int>& satisfaction) {
    sort(satisfaction.begin(),satisfaction.end());
    int k=satisfaction[satisfaction.size()-1];
    if(k<0)
    return k;
    int time=1,sum=0,s=0,maxsum=INT_MIN;
    for(int i=0;i<satisfaction.size();i++){
        for(int j=i;j<satisfaction.size();j++){
            sum=sum+satisfaction[j]*time;
            time++;
        }
        if(sum>maxsum)
            maxsum=sum;
        sum=0;
        time=1;
    }
    return maxsum;
}

int main(){
    vector<int> nums={2,32,23,63,-85,45,7,27,-91,51,-5,-94,-79,-91,61,-72,-55,95,-14,-39,-26,-14,-25,14,-54,81,15,21,-90,80};
    cout<<maxSatisfaction(nums);
    return 0;
}