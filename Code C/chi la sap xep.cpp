#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
#include<algorithm>
using namespace std;
static int a[1000000],b[1000000],n,m;
int Init(){
	cin>>n>>m;
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	for (int i=0;i<m;i++){
		cin>>b[i];
	}
}
//int InterChangeSort(){
//	for (int i=0;i<n-1;i++){
//		for (int j=i+1;j<n;j++){
//			if( a[i]>a[j] ) swap(a[i],a[j]);
//		}
//	}
//}
//void QuickSort(){
//	int i=left, j= right;
//}
int BinarySearch( int x ){
	int low=0, high=n-1;
	int mid=(high+low)/2;
	while(low<=high){	
		if ( x>=a[mid] ) low = mid+1;
		else if ( x<a[mid] ) high=mid-1;		
		mid=(high+low)/2;
	}
	mid=(high+low)/2;
//	if (x>a[mid]) return mid+1;
//	else return mid;
	return mid+1;
}
int main()
{ 
 Init();
//InterChangeSort();
sort(a,a+n);
for (int i=0;i<m;i++){
	if (b[i]<a[0]){
		cout<<"0"<<endl;
	}
	else if(b[i]>a[n-1]){
		cout<<n<<endl;
	}
	else cout<<BinarySearch(b[i])<<endl;
}
}

