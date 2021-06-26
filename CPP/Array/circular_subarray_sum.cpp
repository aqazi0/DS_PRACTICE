// Largest sum of subarray of circular array
#include<bits/stdc++.h>
using namespace std;

// int largest_sum(int a[], int n){
//     int l=INT_MIN,s=0,st=0,end_index;
//     for(int j=0;j<2;j++){
//         for(int i=0;i<n;i++){
//             s=s+a[i];
//             if(s>l){
//                 l=s;
//             }
//             if(i==end_index)
//             break;
//             if(s<0){
//                 s=0;
//                 st=i+1;
//             }
//         }
//         end_index=st;
//         if(s==0||l+a[0]<0)
//         break;
//     }
//     return l;
// }

int kadane(int a[],int n){
    int l=INT_MIN,s=0;
    for(int i=0;i<n;i++){
        s=s+a[i];
        if(s>l)
        l=s;
        if(s<0){
            s=0;
        }
    }
    return l;
}


int main(){
    int n;
    cin>>n;
    int a[n];
    int total=0;
    int k,flag=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int nonwrapsum=kadane(a,n);
    for(int i=0;i<n;i++){
        total+=a[i];
        if(a[i]>0)
        flag=1;
        a[i]*=-1;
    }
    int wrapsum=total+kadane(a,n);
    if(flag==1)
    cout<<max(wrapsum,nonwrapsum);
    else
    cout<<nonwrapsum;
    return 0;
}