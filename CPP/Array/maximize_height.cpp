#include<bits/stdc++.h>

using namespace std;

int getMinDiff(int arr[], int n, int k) {
        // code here
        int larg=INT_MIN, smal=INT_MAX,i=0, diff=0;
        if(arr[0]>k){
            arr[0]+=k;
            smal=arr[0];
            larg=INT_MAX;
            i=1;
        }
        else{
            i=0;
        }
        sort(arr,arr+n);
        while(i<n){
            if(arr[i]<k){
                arr[i]+=k;
                larg=arr[i];
                smal=arr[0];
                diff=larg-smal;
                i++;
                continue;
            }
            else
            {
                if((arr[i]+k)-smal<larg-(arr[i]-k)){
                    arr[i]+=k;
                    larg=arr[i];
                }
                else{
                    arr[i]-=k;
                    smal=arr[i];
                }
                diff=larg-smal;
            }
            cout<<larg<<"   "<<smal<<endl;
            i++;
        }
        // for(int i=0;i<n;i++)
        //     cout<<arr[i];
        return diff;
    }


int main(){
    int n,k;
    cin>>k;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    cout<<getMinDiff(a,n,k);
}