#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
using namespace std;
static int a[40],n,m,b[40],c[40],h;
static bool ok= true;
int revenue;
int Init (){// cau hinh dau tien
cout<<"Max amount you need to compute : "<<endl;
	cin>>m;
	cout<<"Min amount you need to compute : "<<endl;
	cin>>h;
	cout<<"Total amount : "<<endl;
	cin>>n;
	for (int i=1;i<=n;i++){
		cout<<"Amount "<<i<<" : ";
		cin>>b[i];
		cout<<"Revenue "<<i<<" : ";
		cin>>c[i];
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
int DisplayRevenue (){
	int sum=0;
	for (int i=1;i<=n;i++){
		if (a[i]==1){
			sum+=(b[i]+((b[i]*c[i])/100));
		}
		
	}
	revenue=sum;
	cout <<"Your revenue is : "<<sum<<endl;
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
{
	int max=0;
int min=100000000;
Init();
	while (ok){
		Sinh();
	
		int temp=sum();
		if (temp>=m) continue;
		if (temp>=h&&temp-h<min){
				cout<<endl;
			In();
			 DisplayRevenue();
		cout<<"\n\nThe total amount payable in this case is : "<<temp<<endl;
		cout<<"Revenue in this case is : "<<revenue<<endl;
		 max=temp;
		 min=temp-h;
		 }
		
	}
	
	cout<<"Amount max you can pay : "<<max<<" and difference of the amount with the lowest amount : "<<min<<endl;
	cout<<"with revenue : "<<revenue<<endl;
}

