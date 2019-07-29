#include <iostream>
using namespace std;
int soTrangSach;
int a[1000];
int xet[1000];
int init(){
	cin>>soTrangSach;
	for (int i=1;i<=soTrangSach;i++){
		cin>>a[i];
		xet[i]=0;
	}
}
int countNumberOfDay(){
	int count=0;
	for (int i=1;i<=soTrangSach;i++){
		if(xet[i]==1) continue;
	//	cout<<i<<"	";
		for (int j=i;j<=a[i];j++){
		//	if (j>=i+1)cout<<j<<"  ";
			xet[j]=1;
			if (a[j]>a[i]) a[i] = a[j];
			if(j==a[i]) {
			//	cout<<endl;
			}
		}
			count++;
		//	cout<<endl;
	}

	cout<<count<<endl;
}
int main(){
init();
countNumberOfDay();
}

