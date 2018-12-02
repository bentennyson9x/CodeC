#include<iostream>//sinhchinhhop
#include<string>
using namespace std;
void copy(int a[],int b[],int n){
	for(int i=0;i<n;i++){
		b[i]=a[i];
	}
}
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
void sinhtohop(int a[],int n,int k){
	for(int i=k-1;i>=0;i--){
		if(a[i]!=n-k+i+1){
			a[i]++;
			int h=a[i]+1;
			for(int j=i+1;j<k;j++){
				a[j]=h++;
			}
			break;
		}
	}
}
int finaltohop(int a[],int n,int k){
	if(a[0]==n-k+1) return true;
	else return false;
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
int finalhoanvi(int a[],int n){
	for(int i=0;i<n-1;i++){
		if(a[i]<a[i+1]) return false;
	}
	return true;
}
main(){
	int a[100],n,k,b[100];
	cin >> n >> k;
	khoitao(a,k);
	copy(a,b,k);
	in(a,k);
	cout << "\n";
	while(finalhoanvi(b,k)==false){
		sinhhoanvi(b,k);
		in(b,k);
		cout << "\n";
	}
	while(finaltohop(a,n,k)==false){
		sinhtohop(a,n,k);
		copy(a,b,k);
		in(b,k);
		cout << "\n";
		while(finalhoanvi(b,k)==false){
		sinhhoanvi(b,k);
		in(b,k);
		cout << "\n";
		}
	}
}

