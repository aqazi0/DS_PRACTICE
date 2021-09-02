#include<iostream>
using namespace std;

string add(int x,int y){
    int c=0,r;
    string s;
    while((y>0) || (x>0) || (c>0)){
        int k=x%10;
        int h=y%10;
        x=x/10;
        y=y/10;
        if(c==0){
            if(k==0&&h==0)
            r=0;
            else if(k==0 && h==1 || k==1 && h==0)
            r=1;
            else{
                r=0;
                c=1;
            }
        }
        else{
            if(k==0&&h==0){
            r=1;
            c=0;
            }
            else if(k==0 && h==1 || k==1 && h==0){
                r=0;
                c=1;
            }
            else{
                r=1;
                c=1;
            }
        }
        s=char(r+48)+s;
    }
    return s;
}

int main(){
    int a,b;
    cin>>a>>b;
    cout<<add(a,b);
    return 0;
}