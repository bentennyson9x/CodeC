#include <bits/stdc++.h>
using namespace std;
int main(){
cout<<"****Kiem tra so chan le****"<<endl;
int n;
cout<<"Nhap vao so n : "<<endl;
cin>>n;
if (n==0) {
	cout<<n<<" khong la so chan cung khong la so le "<<endl;
}
else {
	if (n%2==0){
		if (n>0){
			cout<<n<<" la so chan va duong "<<endl;
		}
		else {
			cout<<n<<" la so chan va am "<<endl;
		}
}
else if (n%2!=0) {
	if (n>0){
		cout<<n<<" la so le va duong"<<endl;
	}
	else {
		cout<<n<<" la so le va am"<<endl;
	}
}
}
cout<<"Ket thuc chuong trinh"<<endl;
}

