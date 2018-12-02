#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
using namespace std;
static int a[40],n,m,b[40];
static bool ok= true;
int Init (){// cau hinh dau tien
cout<<"Amount you need to compute : "<<endl;
	cin>>m;
	cout<<"Total amount : "<<endl;
	cin>>n;
	for (int i=1;i<=n;i++){
		cout<<"amount "<<i<<" : ";
		cin>>b[i];
	}
}
int In(){ // in ra cau hinh hien tai
	for (int i=1;i<=n;i++){
	cout<<"amount "<<i<<" ";
	}
		cout<<endl;
	for (int i=1;i<=n;i++){
		cout<<a[i]<<"        ";
	}
}
int Sinh(){ // cau hinh tiep theo
	int i=n;
	while (i>0&&a[i]==1){
		a[i]=0;
		i--;
	}
	if (i>0){
		a[i]=1;
	}
	else ok= false;
}
int sum(){
	int s=0;
	for (int i=1;i<=n;i++){
		if (a[i]==1){
			s+=b[i];
		}
	}
	return s;
}
int main()
{ int max=0;
Init();
	while (ok){
		Sinh();
	
		sum();
		if (sum()>=m) break;
		if (sum()>max){
				cout<<endl;
			In();
		cout<<endl;
		 max=sum();
		 }
	}
	cout<<"Amount max you can pay : "<<max<<endl;;
}

