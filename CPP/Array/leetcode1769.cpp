#include<bits/stdc++.h>
using namespace std;

void print(vector<int> answer){
    for(int i=0;i<answer.size();i++){
        cout<<answer[i];
    }
}


vector<int> minOperations(string boxes) {
        vector<int> answer;
        int operation=0;
        for(int i=0; i<boxes.size();i++){
            char ch=boxes[i];
            for(int j=0;j<boxes.size();j++){
                char ch1=boxes[j];
                if(ch1=='1'){
                    cout<<ch1<<"  ";
                    operation=operation+abs(i-j);
                }
            }
            cout<<endl;
            answer.push_back(operation);
            operation=0;
        }
        return answer;
    }


int main(){
    string st="110";
    print(minOperations(st));
    return 0;
}