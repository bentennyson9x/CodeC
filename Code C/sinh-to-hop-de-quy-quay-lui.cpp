//sinh to hop
#include<iostream>
using namespace std;
int n,a[10],k;
void in(){
	for(int i=1;i<=k;i++) cout<<a[i]<<" ";
	cout<<endl;
}
void tim(int i){
	if(i==k+1){
		in();
		return;
	}
	for(int j=a[i-1]+1;j<=n-k+i;j++){
		a[i]=j;
		tim(i+1);
	}
}
int main(){
	cin>>n>>k;
	a[0]=0;
	tim(1);
}
