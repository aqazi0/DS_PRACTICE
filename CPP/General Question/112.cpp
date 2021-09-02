#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int a,b,c;
        int l,s,m;
        int flag=0;
        cin>>a;
        cin>>b;
        cin>>c;
        l=max(a,max(b,c));
        s=min(a,min(b,c));
        if(l==a&&s==b)
            m=c;
        else if(l==b&&s==c)
            m=a;
        else
            m=b;
        if((a+b+c)%4==0){
            if(l-(s*2)==0 && s==m){
                flag=1;
            }
            if(l-(s*2)<0){
                flag=1;
            }
        }
        if(flag==1)
            cout<<"YES";
        else
            cout<<"NO";
    }
    return 0;
}