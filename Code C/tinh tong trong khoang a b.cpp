#include<bits/stdc++.h>
using namespace std;
int main()
{ static int a,b,c;
cin>>a>>b;
if (a<b){
	for (int i=a;i<=b;i++){
	c+=i;
}
}
else {
	for (int i=b;i<=a;i++){
	c+=i;
}
}
cout<<c;
}

