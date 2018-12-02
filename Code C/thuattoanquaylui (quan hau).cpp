#include <iostream>// ham vao ra co ban
#include <cmath>// de dung ham toan hoc
#include <cstdlib>// de dung cac lam co ban
#include <ctime>// de dung thoi gian
#include <cstring>// de dung chuoi ( C )
#include <string>// de dung chuoi
#include<iomanip>// de dung ham setw
#include<stack>// de dung ham ngan xep
using namespace std;
int dem =0;
void display(int &n, int x[]){
	for (int i=1;i<=n;i++){
		cout<<x[i]<<" ";
	}
}
int xet(int i, bool a[], bool xuoi[], bool nguoc[], int &n,int x[] ){
	for (int j=1;j<=n;j++){
		if (a[j]and xuoi[i-j+n] and nguoc[i+j-1]){
					x[i]=j;
		a[j]=false;
		xuoi[i-j+n]=false;
		nguoc[i+j-1]=false;
		if (i==n){
			display(n,x);
			cout<<endl;
			dem ++;
		}
		else xet(i+1,a,xuoi,nguoc,n,x);
		a[j]=true;
		xuoi[i-j+n]=true;
		nguoc[i+j-1]=true;
		}
	}
}
int main()
{
bool a[100],xuoi[100], nguoc[100];
int x[100]; 
int n;
memset (a,true,sizeof a);
memset (xuoi,true,sizeof xuoi);
memset (nguoc,true,sizeof nguoc);
cin>>n;
xet(1,a,xuoi,nguoc,n,x);
cout << dem;

}

