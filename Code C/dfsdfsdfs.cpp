#include <bits/stdc++.h>
using namespace std;
int a[1000], n, stop =0;
int Init () {
	cout<<" Please enter number must be init : ";
	cin>>n;
	for(int i=0; i<n; i++) {
		a[i]=0;
	}
}
int initPermunation() {
	cout<<" Please enter number must be init : ";
	cin>>n;
	for(int i=1; i<=n; i++) {
		a[i]=i;
	}
}
int display () {
	cout<<"Generate ";
	for (int i=0; i<n; i++) {
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int displayPermunation () {
	cout<<"Generate ";
	for (int i=1; i<=n; i++) {
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int generateBinary() {
	display();
	int i = n-1;
	while (i>=0&&a[i]==1) {
		a[i]=0;
		i--;
	}
	if (i==-1) stop = 1;
	else a[i]=1;

}
int generatePermunation() { // sinh hoan vi
	displayPermunation();
	int i=n-1,k=n;
	while (i>0&&a[i]>a[i+1])i--;
	if (i==0) stop=1;
	else {
		while (a[i]>a[k]) k--;
		swap(a[i],a[k]);
		int c=n, r=i+1;
		while (r<=c) {
			swap(a[c],a[r]);
			r++;
			c--;
		}
	}

}
int main() {
	initPermunation();
	while (stop!=1) {
		//	generateBinary();
		generatePermunation();
	}

}

