#include<bits/stdc++.h>

using namespace std;

void print(vector<vector<int>> ans){
        for(int i=0;i<ans.size();i++){
            for(int j=0;i<ans[i].size();j++){
                cout<<ans[i][j];
            }
            cout<<endl;
        }
}

vector<vector<int>> generate(int numRows) {
    vector<vector<int>> ans(numRows);
    cout<<1;
    int i,j;
    for(i=0;i<numRows;i++){
        ans[i][0]=1;
    //     for(j=0;j<((2*i)-1);j++){
            
    //     }
    //     if(j>0)
    //         ans[i].push_back(1);
    }
    return ans;
}

int main(){
    int n;
    cin>>n;
    print(generate(n));
    return 0;
}