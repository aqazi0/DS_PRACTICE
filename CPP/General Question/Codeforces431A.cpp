//A black Square

#include<bits/stdc++.h>
#include<string>

using namespace std;
int main(){
    int a[5];
    for(int i=1;i<5;i++){
        cin>>a[i];
    }
    cin.get();
    string st;
    int cal=0;
    getline(cin,st);
    for(int i=0;i<st.size();i++){
        cal=cal+a[int(st[i]-48)];
    }
    cout<<cal;
    return 0;
}