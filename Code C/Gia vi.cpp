#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
using namespace std;
static int s[100], b[100],a[100],n;
bool ok=true;
// thuat toan sinh
int Init(){

 			cin>>n;// nhap vao so thanh phan gia vi
	 

	for (int i=1;i<=n;i++){
		cin>> s[i];
		cin>> b[i];
	}
}
int Sinh(){
	int i=n;
	int dem =1;
	while (i>0&&a[i]==1){
		a[i]=0;
		dem++;
		i--;
	}
	if(i>0){
		a[i]=1;
	}
	else ok=false;
}
int In(){
	for (int i=1;i<=n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int Cond(){
	int h=1;// tich do chua
	int k=0;// tong do cay
	for (int i=1;i<=n;i++){
		if (a[i]==1){
			h*=s[i];
			k+=b[i];
		}
	}
	int y=abs(h-k);
	return y;
}
int main()
{ 
Init();
int min=100000000;
if (n==1){
	min=s[1]-b[1];
	if (min<0) min*=-1;
	cout<<min;
}
else{
//	Sinh();
//min=Cond();
Sinh();
	while (ok){
	In();
	
	if (min>Cond()){
		min=Cond();
		}
	Sinh();
	}
cout<<min;

}

}
    
