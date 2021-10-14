# include<bits/stdc++.h>

using namespace std;

int fact(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}


string getPermutation(int n, int k) {
    string s="";
    int n1=n;
    k--;
    for (int i = 0; i < n; i++)
    {
        s=s+to_string(i+1);
    }
    for(int i=0;i<n-1;i++)
    {
        int f=fact(n1-1);
        int r=k/f;
        int t=k%f;
        swap(s[i], s[i+r]);
        sort(s.begin()+i+1, s.end());
        k=k-(f*r);
        if(t==0)
            break;
        n1--;
    }
    return s;
}

int main(){
    int n,k;
    cin>>n>>k;
    cout<<getPermutation(n,k);
    return 0;
}