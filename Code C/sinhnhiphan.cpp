#include<iostream>
#include<string>
using namespace std;
int a[100];
int ok=0;
void sinhNP(int a[100],int n){
	for(int i=n-1;i>=0;i--){
		if(a[i]==0){
			a[i]=1;
			for(int k=i+1;k<n;k++){
				a[k]=0;
			}
			break;
		}
		if(i==0)	ok=1;
	}
	
}
bool final(int a[100],int n){
	int dem=0;
	for(int i=0;i<n;i++){
		if(a[i]==1)++dem;
	}
	if(dem==n)return true;
	return false;
}
void gan(int a[100],int n){
	for(int i=0;i<n;i++){
		a[i]=0;
	}
}
void in(int a[100],int n){
	for(int i=0;i<n;i++){
		printf("%d",a[i]);
	}
}
main(){
	int n,a[100];
	scanf("%d",&n);
	gan(a,n);
	in(a,n);
	while(true){
		printf("\n");
		sinhNP(a,n);
		if(ok==1) break;
		in(a,n);
	}
}



