#include<iostream>// sinhhoanvi
#include<algorithm>
using namespace std;
void khoitao(int a[],int n){
	for(int i=0;i<n;i++){
		a[i]=i+1;
	}
}
void in(int a[],int n){
	for(int i=0;i<n;i++){
		cout << a[i];
	}
}
int finalhoanvi(int a[],int n){
	for(int i=0;i<n-1;i++){
		if(a[i]<a[i+1]) return false;
	}
	return true;
}
void sinhhoanvi(int a[],int n){
	for(int i=n-1;i>0;i--){
		if(a[i]>a[i-1]){
			int k=n-1;
			while(a[i-1]>a[k]) k--;
			swap(a[k],a[i-1]);
			int c=n-1,r=i;
			while(r<c){
				swap(a[c],a[r]);
				c--;r++;
			}
			break;
		}
	}
}
main(){
	int a[100],n;
	cin >> n;
	khoitao(a,n);
	in(a,n);
	cout << "\n";
	while(finalhoanvi(a,n)==false){
		sinhhoanvi(a,n);
		in(a,n);
		cout << "\n";
	}
	
}

