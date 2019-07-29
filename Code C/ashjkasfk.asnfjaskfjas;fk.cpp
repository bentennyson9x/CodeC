#include <bits/stdc++.h>
using namespace std;
// viet 1 chuong trinh kiem tra so nguyen to, va in nhung so la so nguyen to nho hon 1000
// input n >1000;
int ktraSNT(int data){
	for (int i=2;i<data;i++){
		if (data%i==0) return 0;
	}
	return 1;
}
int ktranhohon1000(int data){
	if (data>1000) return 0;
	return 1;
}
int linhtalinhtinh(){
	cout<<"linhtinh"<<endl;
}
int main(){
int n;
cin>>n;
for (int i=0;i<=n;i++){
	if(ktraSNT(i)==1&&ktranhohon1000(i)==1){
		cout<<i<<endl;
	}
}
linhtalinhtinh();


}
