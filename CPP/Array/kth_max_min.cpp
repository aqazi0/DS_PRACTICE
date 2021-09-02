
#include<bits/stdc++.h>
using namespace std;


int partition(vector<int> &a, int l, int h){
	int pivot=a[h],i=l-1;
	for(int j=l;j<h;j++){
		if(a[j]<=pivot){
			swap(a[j],a[++i]);
		}
	}
	swap(a[i+1],a[h]);
	return i+1;
}

int kth_min_max(vector<int> &a,int l,int h,int k){
		if(k<=h+1 && k>0){
			int index=partition(a,l,h);
			if(index+1==k)
				return a[index];
			if(index+1>k){
				return kth_min_max(a,0,index-1,k);
			}
			return kth_min_max(a,index+1,h,k);
		}
		return -1;
}



int main(){
	int n;
	cin>>n;
	vector<int> a(n);
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	int k;
	cin>>k;
	int l=0,h;
	h=n-1;
	cout<<k<<" smallest element is "<<kth_min_max(a,l,h,k)<<endl;
	cout<<k<<" largest element is "<<kth_min_max(a,l,h,h-k+2)<<endl;
	return 0;
}