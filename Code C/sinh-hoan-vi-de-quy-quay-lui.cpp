//hoan vi
#include<iostream>
using namespace std;
int n,a[10],x[10]={0};
void in(){
	for(int i=1;i<=n;i++) cout<<a[i]<<" ";
	cout<<endl;
}
void tim(int i){
	if(i==n+1){
		in();
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
	cin>>n;
	tim(1);
}
