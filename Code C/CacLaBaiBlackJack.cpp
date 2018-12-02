#include<bits/stdc++.h>
using namespace std;
static int a[1000000],n,m;
int QuickSort(int left, int right){
	int pivot = a[(left+right)/2];
	int i= left;
	int j= right;
	while (i<=j){
		while (a[i]<pivot) i++;
		while (a[j]>pivot) j--;
		if (i<=j){
			swap(a[i],a[j]);
			i++;
			j--;
		}
	}
	if (i<right) QuickSort(i,right);
	if (j>left) QuickSort (left,j);
}
int BinarySearch(int x, int b, int c){
	int left=0, right=n-1,mid=0;
	while (left<=right){
		mid= (left+right)/2;
		if (a[mid]<x) left = mid +1;
		else if (a[mid]>x) right = mid -1;
		else {
			while (mid==b||mid==c||a[mid]>x) mid--;
		//	cout<<"mid la : "<<mid<<endl;
			return mid;
		}
	}
	while (mid==b||mid==c||a[mid]>x) mid--;
		//	cout<<"mid la : "<<mid<<endl;
			return mid;
}
int Test (){
	int max=0,s=0,temp=0;
	for (int i=0;i<n-1;i++){
		for (int j=i+1;j<n;j++){
			s=m-(a[i]+a[j]);
//			cout<<"i la: "<<i<<" j la: "<<j<<endl;
//			cout<<"s la : "<<s<<endl;
			temp= a[i]+a[j]+a[BinarySearch (s,i,j)];
			if (max<temp) max = temp;	
//			cout<<"max la: "<<max<<endl;		
		}
	}
	return max;
}
int main()
{ 
cin>>n>>m;
for (int i=0;i<n;i++){
	cin>>a[i];
}
QuickSort(0,n-1);
cout<<Test()<<endl;

}

