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
int Tich(Dathuc &a, Dathuc &b, int c[]){
		for (int j=0;j<=a.somu;j++){
			for (int k=0;k<=b.somu;k++){
				c[j+k]+=a.heso[j]*b.heso[k];
			}
		}
}
int HienThi (Dathuc &a, Dathuc &b, int c[]){
	for (int i=0;i<=a.somu+b.somu;i++){
		if (c[i]==0) continue;
		else if (i==0) cout<<c[i];
		else if (i==1) cout<<"+"<<c[i]<<"x";
		else if (i==a.somu+b.somu) cout<<"+"<<c[i]<<"x^"<<i;
		else cout<<"+"<<c[i]<<"x^"<<i;
	}
}
int main()
{ Dathuc p,q;
int c[100]={0};
//c.heso=new int [p.somu+q.somu];
cout<<"Nhap da thuc P: "<<endl;
Nhap (p);
cout<<"\nNhap da thuc Q: "<<endl;
Nhap (q);
Tich(p,q,c);
HienThi(p,q,c);


}
