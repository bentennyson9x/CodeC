#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
using namespace std;
int SinhXau(int a[], int &n, int &ok){
	int i=n;
	while (i>0&&a[i]==1){ 			/// 000 001 010
	a[i]=0;
	i--;
	}
	if (i>0) a[i]=1;
	else ok=1;
}
int display (int a[], int &n, int &ok){
	while (ok==0){
		for (int i=1;i<=n;i++){
			cout<<a[i]<<" ";
		}
			SinhXau(a,n,ok);
		cout<<endl;
	}
}
int main()
{ static int a[100],n;
int ok=0;
cin>>n;
display(a,n,ok);



}

