#include<bits/stdc++.h>
using namespace std;
int main()
{ int n;
cin>>n;
static int nam, ngay, tuan;
for (int i=0;i<3;i++){
	if(i==0) {
		nam=n/365;
		n=n%365;
	}
	if (i==1){
		tuan=n/7;
		n=n%7;
	}
	if (i==2){
		ngay=n/1;
		n=n%1;
	}
}
cout<<nam<<" "<<tuan<<" "<<ngay;
}

