#include <iostream>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string>
using namespace std;
typedef struct {
	float *heso;
	int somu;
}Dathuc;
void Nhap(Dathuc &a){
cout<<"Nhap bac cua da thuc: ";
cin>>a.somu;
cout<<"\nNhap da thuc: ";
	a.heso= new float;
for (int i=0;i<=a.somu;i++){
	cout<<"\nNhap he so tai x^"<<i<<": ";
	cin>>a.heso[i];
	}
}
int Tong(Dathuc &a, Dathuc &b, Dathuc &c){
	for (int i=0;i<=b.somu||i<=a.somu;i++){
		c.heso[i]=a.heso[i]+b.heso[i];
		}
}
int Hieu(Dathuc &a, Dathuc &b, Dathuc &c){
	if (a.heso[a.somu]-b.heso[b.somu]==0){
		c.somu=a.somu-1;
	} 
			for (int i=0;i<=b.somu||i<=a.somu;i++){
		c.heso[i]=a.heso[i]-b.heso[i];
		}
}
int Tich(Dathuc &a, Dathuc &b, Dathuc &c){
	c.somu=a.somu+b.somu;
		for (int j=0;j<=a.somu;j++){
			for (int k=0;k<=b.somu;k++){
				c.heso[j+k]+=a.heso[j]*b.heso[k];
			}
		}
}
int HienThiThuong (Dathuc &c){
			for (int i=0;i<=c.somu;i++){
		if (c.heso[i]==0) continue;
		else if (i==0) cout<<c.heso[i];
		else if (i==1) cout<<"+"<<c.heso[i]<<"x";
		else if (i==c.somu) cout<<"+"<<c.heso[i]<<"x^"<<i;
		else cout<<"+"<<c.heso[i]<<"x^"<<i;

		}
}
int Thuong(Dathuc &a, Dathuc &b, Dathuc &c,Dathuc &kq,Dathuc &du,Dathuc &temp){
	du=a;kq.somu=a.somu-b.somu;
	while (du.somu>=b.somu){
		c.heso[du.somu-b.somu]=du.heso[du.somu]/b.heso[b.somu];
		c.somu=du.somu-b.somu;
		kq.heso[du.somu-b.somu]=c.heso[du.somu-b.somu];
		Tich(b,c,temp);	
		Hieu(du,temp,du);
		delete c.heso,temp.heso;
		c.heso= new float (a.somu+b.somu);	
		temp.heso=new float (c.somu+b.somu);
		temp.heso[0]=0;
	}
}

int HienThiTH (Dathuc &a, Dathuc &b, Dathuc &c){
			for (int i=0;i<=a.somu;i++){
		if (c.heso[i]==0) continue;
		else if (i==0) cout<<c.heso[i];
		else if (i==1) cout<<"+"<<c.heso[i]<<"x";
		else if (i==a.somu) cout<<"+"<<c.heso[i]<<"x^"<<i;
		else cout<<"+"<<c.heso[i]<<"x^"<<i;
		}	
	if (a.somu<=b.somu){
			for (int i=0;i<=b.somu;i++){
		if (c.heso[i]==0) continue;
		else if (i==0) cout<<c.heso[i];
		else if (i==1) cout<<"+"<<c.heso[i]<<"x";
		else if (i==b.somu) cout<<"+"<<c.heso[i]<<"x^"<<i;
		else cout<<"+"<<c.heso[i]<<"x^"<<i;
	}
	}
}
int HienThiTT (Dathuc &a, Dathuc &b, Dathuc &c){
		for (int i=0;i<=a.somu+b.somu;i++){
		if (c.heso[i]==0) continue;
		else if (i==0) cout<<c.heso[i];
		else if (i==1) cout<<"+"<<c.heso[i]<<"x";
		else if (i==a.somu+b.somu) cout<<"+"<<c.heso[i]<<"x^"<<i;
		else cout<<"+"<<c.heso[i]<<"x^"<<i;
	}
//	if (a.somu>=b.somu){
//			for (int i=0;i<=a.somu-b.somu;i++){
//		if (c[i]==0) continue;
//		else if (i==0) cout<<c[i];
//		else if (i==1) cout<<"+"<<c[i]<<"x";
//		else if (i==a.somu-b.somu) cout<<"+"<<c[i]<<"x^"<<i;
//		else cout<<"+"<<c[i]<<"x^"<<i;
//	}
//	}
}
int main()
{ Dathuc p,q,d,kq,du,temp;
float c[100]={0};
d.heso=new float [p.somu+q.somu];
du.heso=new float [p.somu+q.somu];
temp.heso=new float [p.somu+q.somu];
cout<<"Nhap da thuc P: "<<endl;
Nhap (p);
cout<<"\nNhap da thuc Q: "<<endl;
Nhap (q);
Thuong(p,q,d,kq,du,temp);
HienThiThuong(kq);
}
