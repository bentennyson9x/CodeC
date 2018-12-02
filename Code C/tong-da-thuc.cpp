#include <iostream>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string>
using namespace std;
typedef struct {
	int *heso;
	int somu;
}Dathuc;
void Nhap(Dathuc &a){
cout<<"Nhap bac cua da thuc: ";
cin>>a.somu;
cout<<"\nNhap da thuc: ";
	a.heso= new int;
for (int i=0;i<=a.somu;i++){
	cout<<"\nNhap he so tai x^"<<i<<": ";
	cin>>a.heso[i];
	}
}
int Tong(Dathuc &a, Dathuc &b, Dathuc &c){
	for (int i=0;i<=a.somu||i<=b.somu;i++){
		c.heso[i]=a.heso[i]+b.heso[i];
		//cout<<"gia tri cua c.heso["<<i<<"] la: "<<c.heso[i]<<endl;
	}
}
int HienThi (Dathuc &a, Dathuc &b, Dathuc &c){
	for (int i=0;i<=a.somu||i<=b.somu;i++){
		if (i==0) cout<<c.heso[i];
		else if (i==1) cout<<"+"<<c.heso[i]<<"x";
		else cout<<"+"<<a.heso[i]<<"x^"<<i;
	}
}
int main()
{ Dathuc p,q,c;
c.heso=new int;
cout<<"Nhap da thuc P: "<<endl;
Nhap (p);
cout<<"\nNhap da thuc Q: "<<endl;
Nhap (q);
Tong(p,q,c);
HienThi(p,q,c);


}


