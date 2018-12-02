//chinh hop
#include<iostream>
using namespace std;
int n,a[10],x[10]={0},k,d=1;
void in(){
	for(int i=1;i<=k;i++) cout<<a[i]<<" ";
	cout<<endl;
	cout<<d<<endl;
}
void tim(int i){
	if(i==k+1){
		in();
		d++;
		return;
	}
	for(int j=1;j<=n;j++){
		if(x[j]==0){
			a[i]=j;
			x[j]=1;
			tim(i+1);
			x[j]=0;
		}
	}
}
int main(){
	cin>>n>>k;
	a[0]=0;
	tim(1);
}
