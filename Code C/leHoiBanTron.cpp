#include<bits/stdc++.h> 
using namespace std;
int a[100],b[100];
int n,m;
void sinhNP(int a[100],int n){
	for(int i=n-1;i>=0;i--){
		if(a[i]==0){
			a[i]=1;
			for(int k=i+1;k<n;k++){
				a[k]=0;
			}
			break;
		}
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
void xetDK (int a[100],int b[100]){
	int i=0;
//	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			if (a[j]==0) {
				i=i-1;
			}
			else if (a[j]==1){
				 i=i+1;
			}	
				if (i<0) {
				i = m-1;
			}
			if (i==m){
				i = 0;
			} 					
		}
		
			b[i]=1;			
//	}
}
int duyetKQ(){ 
int r=0;
	cout<<endl;
	for (int i=0;i<m;i++){
		if(b[i]==1) r++;
	}
	cout<<"\n result is : "<<r<<endl;
}
main(){
	cin>>m>>n;
	gan(a,n);
	xetDK(a,b);
	while(final(a,n)==false){
		printf("\n");
		sinhNP(a,n);
		xetDK(a,b);
	}
	duyetKQ();
	
}



