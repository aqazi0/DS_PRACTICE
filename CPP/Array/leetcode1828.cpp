#include<bits/stdc++.h>
using namespace std;

void print(vector<int> answer){
    for(int i=0;i<answer.size();i++){
        cout<<answer[i];
    }
}

float distance(int x1,int y1,int x2,int y2){
    cout<<sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)))<<endl;
    return sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
}

vector<int> countPoints(vector<vector<int>>& points, vector<vector<int>>& queries) {
        vector<int> ans;
        int count=0;
        for(int i=0;i<queries.size();i++){
            for(int j=0;j<points.size();j++){
                if(distance(points[j][0],points[j][1],queries[i][0],queries[i][1])<=queries[i][2]){
                    count++;
                }
            }
            ans.push_back(count);
            count=0;
        }
        return ans;
    }

int main(){
    vector<vector<int>> points={{1,3},{3,3},{5,3},{2,2}};
    vector<vector<int>> queries={{2,3,1},{4,3,1},{1,1,2}};
    print(countPoints(points,queries));
    return 0;
}