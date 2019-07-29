#include <bits/stdc++.h>
using namespace std;
int main(){
	cout<<" ****Day la chuong trinh tinh toan****\n Menu:\n 1. Tinh tong\n 2. Tinh hieu \n 3. Tinh tich \n 4. Tinh thuong \n 5. Thoat \n Ban muon chon cai nao ?"<<endl;
	int luaChon;
	cout<<" ";
	cin>>luaChon;
	if(luaChon==1){
	cout<<"Vui long nhap 2 so a va b"<<endl;
	int a,b;
	cin>>a>>b;
	cout<<"Tong cua 2 so "<<a<<" va "<<b<<" la "<<a+b<<endl;
	}
	else if (luaChon==2){
	cout<<"Vui long nhap 2 so a va b"<<endl;
	int a,b;
	cin>>a>>b;
	cout<<"Hieu cua 2 so "<<a<<" va "<<b<<" la "<<a-b<<endl;
	}
	else if (luaChon==3){
	cout<<"Vui long nhap 2 so a va b"<<endl;
	int a,b;
	cin>>a>>b;
 	cout<<"Tich cua 2 so "<<a<<" va "<<b<<" la "<<a*b<<endl;
	}
	else if (luaChon==4){
	cout<<"Vui long nhap 2 so a va b"<<endl;
	int a,b;
	cin>>a>>b;
		if (b==0){
			cout<<"Khong co thuong cua 2 so "<<a<<" va "<<b<<endl;
		}
		else {
			cout<<"Thuong cua 2 so "<<a<<" va "<<b<<" la "<<a/b<<endl;
		}
	}
	else if (luaChon==5){
		cout<<"Chuong trinh da ket thuc!"<<endl;
	}

}
