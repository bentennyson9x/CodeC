#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
using namespace std;
static int a[100],b[100],t,n,m;
bool ok= true;
int Init()
	{
	cin>>n>>m;
	for (int i=1; i<=n; i++)
		{
		cin>>b[i];
		a[i]=i;
		}
	}
int SinhToHop(){
	int i=3;
	while(i>0&&a[i]==n-3+i){
		i--;
	}
	if (i>0){
		a[i]+=1;
		for (int j=i+1;j<=3;j++){
			a[j]=a[i]+j-i;
		}
	}
	else ok=false;
}
int In(){
	for (int i=1;i<=3;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
//int IntersectionCharge (){
//	for (int i=1;i<=n-1;i++){
//		for (int j=i+1;j<=n;j++){
//			if (b[i]>b[j]) swap(b[i],b[j]);
//		}
//	}
//}
int Test()
	{
	int s=0;
	for(int i=1;i<=3;i++){
		s+=b[a[i]];
	}
	
	return s;
	}

int main()
	{
	 	   int max;
			Init();
		//	IntersectionCharge();
		  max=10;
		  ok=true;
		 SinhToHop();
		while (ok)
			{
			if ( Test()<=m ) {
				if ( max<Test() ){
				   max=Test();
				}
			}
//			else break;
			SinhToHop();
//			In();
//			cout<<Test()<<" "<<max[i]<<endl;
			}
			cout<<max<<" ";
	}

