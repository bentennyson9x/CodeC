#include<bits/stdc++.h>
using namespace std;
static int a[1000000];
int n,k;
int QuickSort (int left, int right){
	int pivot = a[(left+right)/2];
	int i=left;
	int j=right;
	while (i<=j){
		while (a[i]<pivot) i++;
		while (a[j]>pivot) j--;
		if (i<=j){
			swap(a[i],a[j]);
			i++;
			j--;
		}
	}
	if (i<right) QuickSort (i,right);
	if (j>left) QuickSort(left,j);	
}
int Test(){
	int s=0;
	int h=k;
	for (int i=n-1;i>=0;i--){
		if (h>=0) {
			s+=a[i];
			h--;
		}
		else s-=a[i];
	}
	return s;
}
int main() {
	cin>>n>>k;
	for (int i=0; i<n; i++) {
		cin>>a[i];
	}
	QuickSort(0,n-1);
	cout<<Test()<<endl;

}

