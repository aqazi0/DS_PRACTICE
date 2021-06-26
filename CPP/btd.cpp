#include<iostream>
#include<math.h>
using namespace std;
int btd(int num){
    int k=0, s=0, r;
    while(num!=0)
    {
        r=num%10;
        num=num/10;
        s=s+r*pow(2,k++);
    }
    return s;
}


int htd(string num){
    int k=0, s=0, r;
    for(int i=num.length()-1;i>=0;i--)
    {
        char ch=num.at(i);
        if(ch=='A')
        r=10;
        else if(ch=='B')
        r=11;
        else if(ch=='C')
        r=12;
        else if(ch=='D')
        r=13;
        else if(ch=='E')
        r=14;
        else if(ch=='F')
        r=15;
        else if(ch=='G')
        r=16;
        else
        r=int(ch)-48;
        s=s+r*pow(16,k++);
    }
    return s;
}

string dth(int num){
    int k=0, r;
    string s="";
    while(num!=0)
    {
        char ch;
        r=num%16;
        num=num/16;
        if(r==10)
        ch='A';
        else if(r==11)
        ch='B';
        else if(r==12)
        ch='C';
        else if(r==13)
        ch='D';
        else if(r==14)
        ch='E';
        else if(r==15)
        ch='F';
        else
        ch=char(r+48);
        s=ch+s;
    }
    return s;
}


int main(){
    int n;
    string hdn;
    cin>>n;
    cout<<dth(n);
    return 0;
}