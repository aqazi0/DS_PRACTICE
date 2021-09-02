// largest sum of subarray (Kadane Algorithm)
#include<bits/stdc++.h>
using namespace std;

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int k=0,i=0,j=0;
        while(k<m+n && n!=0)
        {
            if(j>=n && i<m){
                i++;
            }
            else if(i>=m && j<n){
                nums1.insert(nums1.begin()+k,nums2[j]);
                j++;
            }
            else{
                if(nums1[i]<=nums2[j]){
                    i++;
                }
                else{
                    nums1.insert(nums1.begin()+k,nums2[j]);
                    j++;
                    i++;
                }
            }
            k++;
        }
        nums1.erase(nums1.begin()+m+n,nums1.end());
    }


int main(){
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int k= removeDuplicates(a);
    for(int i=0;i<k;i++){
        cout<<a[i]<<endl;;
    }
    return 0;
}