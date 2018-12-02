#include<bits/stdc++.h>
using namespace std;
int main()
{ int a,b,c;
cin>>a>>b>>c;
if (((a+b>c)&&(b+c>a)&&(a+c>b))&&a>0&&b>0&&c>0){
	if (a==b||a==c||b==c) {
	 if (a==b&&a==c&&b==c)cout<<3;
	 else cout<<2;
	}
	else if(a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b) cout<<1;
} 
}

