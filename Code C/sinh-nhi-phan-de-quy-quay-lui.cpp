//sinh nhi phan
#include<iostream>
using namespace std;
int n,a[10];
void in(){
	//int tong=0,dem=0;
	for(int i=0;i<n;i++) cout<<a[i]<<" ";
	cout<<endl;
}
void tim(int i){
	if(i==n){
		in();
		return;
	}
	a[i]=0;
	tim(i+1);
	a[i]=1;
	tim(i+1);
}
int main(){
	cin>>n;
	tim(0);
}
